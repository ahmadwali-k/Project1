package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/LoginAdmin")
public class LoginEmployee extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("nick") && password.equals("string1")) {
            out.println("login in Successful");
            RequestDispatcher rd = request.getRequestDispatcher("/refund.html");
            rd.forward(request, response);

        } else {
            out.println("Invalid Credentials");
            RequestDispatcher rd = request.getRequestDispatcher("/emplogin.html");
            rd.include(request, response);
        }
    }
}



/*
package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/emplogin")
public class LoginEmployee extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        //request.getRequestDispatcher("navbar.html").include(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        */
/*Employee employee = new Employee();
        EmployeeDAO dao = EmployeeDAO.getEmployeeDAO();
        dao.getEmployees();*//*



        // when user enters correct details
        //if (username.equals(employee.getFname()) && password.equals(employee.getPassword())) {
        if (LoginDao.validate(username, password)) {
            RequestDispatcher rd = request.getRequestDispatcher("/refund.html");
            rd.forward(request, response);


        } else {
            out.println("Sorry! invalid details");
            RequestDispatcher rd = request.getRequestDispatcher("/emplogin.html");
            rd.include(request, response);
        }
        out.close();
    }
}
*/
