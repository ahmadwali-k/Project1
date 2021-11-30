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

        String fname = request.getParameter("fname");
        String password = request.getParameter("password");


        //EmployeeDAO dao = EmployeeDAO.getEmployeeDAO();
       // Employee employee = new Employee();

        //employee.setFname(fname);
        //employee.setPassword(password);

        //out.println(dao.getEmployee(Integer.parseInt(fname)));
        //refund1.setFname(fname);

       // if (fname.equals("nick") && password.equals("string1")) {
          //  out.println("login in Successful");
            RequestDispatcher rd = request.getRequestDispatcher("/refund.html");
            rd.forward(request, response);

       // } else {
       //     out.println("Invalid Credentials");
       //     RequestDispatcher rd = request.getRequestDispatcher("/emplogin.html");
       //     rd.include(request, response);
        //}
    }
}

