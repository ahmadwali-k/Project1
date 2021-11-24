package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * NaveBar
 *  - Home, Employe, Admin, Contact
 * Login (in demo)
 *  - apply for reimbusement
 *  - view past Tickets(approved/deny/pending)
 *  - Update request (cancel)
 *  - view request table
 * Registration
 *  - get info (save)
 *  - links to signIn page, home
 */

public class EmployeeDAO {
    private static EmployeeDAO dao = null;
    private Configuration configuration;
    private SessionFactory factory;


    private EmployeeDAO() {
        configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        factory = configuration.buildSessionFactory();
    }

    public static EmployeeDAO getEmployeeDAO() {
        if (dao == null) {
            dao = new EmployeeDAO();
        }
        return dao;
    }

    // TODO: 11/19/2021 navbar 

    // TODO: 11/19/2021 login 


    // TODO: 11/19/2021 registration 
    
    public Employee getEmployee(int id) {
        // fetching data from the database.
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = (Employee) session.get(Employee.class, id);

        transaction.commit();
        session.close();

        return employee;
    }

    public List<Employee> getEmployees() {
        Session session = factory.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
        Root<Employee> rootEntry = cq.from(Employee.class);
        CriteriaQuery<Employee> all = cq.select(rootEntry);

        TypedQuery<Employee> allQuery = session.createQuery(all);
        List<Employee> results = allQuery.getResultList();

        session.close();
        return results;
    }

    public void saveEmployee(Employee employee) {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        session.save(employee);
        transaction.commit();
        session.close();
    }

    public void updateEmployee(Employee e) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(e);

        transaction.commit();
        session.close();
    }

    public void deleteEmployee(int id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = getEmployee(id);

        session.delete(employee);

        transaction.commit();
        session.close();
    }
}