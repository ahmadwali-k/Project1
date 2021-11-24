package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GetEmployee extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        out.println("ID No: " + id);


        Employee employee = new Employee();
        EmployeeDAO dao = EmployeeDAO.getEmployeeDAO();
        employee.setId(Integer.parseInt(id));

        // dao1.getRefund(Integer.parseInt(ticket));

        out.println("-----------------------" + dao.getEmployee(Integer.parseInt(id)) + "-----------------------");

        out.println("------------------------All others Requests------------------------");
        List<Employee> Employee = dao.getEmployees();
        for (Employee employee1 : Employee) {
            out.println(employee1);
        }
    }
}