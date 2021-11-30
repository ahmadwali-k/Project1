/**
 * Name: Ahmadwali Zadron
 * Task: Project1 (Expense Reimbusement System)
 * Date: 11/25/21
 * Company: Revature
 */

package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {



        //SystemConfig1.addEmployee();
        Employee employee = new Employee();

        EmployeeDAO dao = EmployeeDAO.getEmployeeDAO();
        RefundDao dao1 = RefundDao.getRefundDao();
        //dao.registerEmployee(employee);
        // dao.saveEmployee(employee);
        dao.getEmployee(employee.getId());

        dao.getEmployees();

        dao.updateEmployee(employee);
        dao.deleteEmployee(employee.getId());


        //SystemConfig.out.println(employee);
    }
}
