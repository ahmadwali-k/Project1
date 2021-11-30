package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;


public class RegServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String phone = request.getParameter("phone");
        String role = request.getParameter("role");
        String addr = request.getParameter("address");
        String password = request.getParameter("password");


        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Employee </title");
        out.println("</head>");
        out.println("<body style= background-color:LightBlue;>");
        out.println("<h1> Employee table </h1>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th> ID </th>");
        out.println("<th> First Name </th>");
        out.println("<th> Last Name </th>");
        out.println("<th> Phone Number </th>");
        out.println("<th> Role </th>");
        out.println("<th> Address (cidy) </th>");
        out.println("<th> Password </th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<th>" + id + "</th>");
        out.println("<th>" + fname + "</th>");
        out.println("<th> " + lname + " </th>");
        out.println("<th> " + phone + " </th>");
        out.println("<th> " + role + " </th>");
        out.println("<th> " + addr + " </th>");
        out.println("<th> " + password + " </th>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");


        Employee employee = new Employee();
        EmployeeDAO dao = EmployeeDAO.getEmployeeDAO();

        //response.sendRedirect("App");
        employee.setId(Integer.parseInt(id));
        employee.setFname(fname);
        employee.setLname(lname);
        employee.setPhone(Integer.parseInt(phone));
        employee.setRole(role);
        employee.setAddr(addr);
        employee.setPassword(password);
        dao.saveEmployee(employee);
        //dao.getEmployees();

    }
}
