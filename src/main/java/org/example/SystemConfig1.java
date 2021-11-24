package org.example;

import javax.persistence.*;
import javax.persistence.Persistence;
import java.util.List;

class SystemConfig1 {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Project1");

    public static void main(String[] args) {
        entityManagerFactory.close();
        addEmployee();
    }

    public static void addEmployee() {

        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            Employee employee = new Employee();
            employee.setId(employee.getId());
            employee.setFname(employee.getFname());
            employee.setLname(employee.getLname());
            employee.setPhone(employee.getPhone());
            employee.setRole(employee.getRole());
            employee.setAddr(employee.getAddr());
            employee.setPassword(employee.getPassword());
            em.persist(employee);
            et.commit();

        } catch (Exception exception) {
            if (et != null) {
                et.rollback();
            }
            exception.printStackTrace();
        } finally {
            em.close();
        }

        entityManagerFactory.close();
    }

    public static void getEmployee(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        String sql = "select c from Employee c where c.id = :empid";

        TypedQuery<Employee> tq = em.createQuery(sql, Employee.class);
        tq.setParameter("empid", id);
        Employee employee = null;
        try {
            employee = tq.getSingleResult();
            System.out.println(employee.getFname() + " " + employee.getFname());
        }
        catch (NoResultException exception) {
            System.out.println(exception);
        }
        finally {
            em.close();
        }
    }
    public static void getEmployees(int id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        String sql = "select c from Employee c where c.id is not null";
        TypedQuery<Employee> tq = em.createQuery(sql, Employee.class);
        List<Employee> employees;
        try {
            employees = tq.getResultList();
            employees.forEach(employee -> System.out.println(employee.getFname() + " " + employee.getFname()));

        } catch (NoResultException exception) {
            exception.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void updateEmployee(int id, String lname) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = null;
        Employee employee = null;
        try {
            et = em.getTransaction();
            et.begin();
            employee = em.find(Employee.class, id);
            employee.setLname(lname);

            em.persist(employee);
            et.commit();

        } catch (Exception exception) {
            if (et != null) {
                et.rollback();
            }
            exception.printStackTrace();
        } finally {
            em.close();
        }

        entityManagerFactory.close();
    }
}
