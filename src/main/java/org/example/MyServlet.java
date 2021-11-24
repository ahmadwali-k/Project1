package org.example;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet implements Servlet{

    ServletConfig config = null;


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
        System.out.println("Servlet is initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service called...");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html></body>");
        pw.print("<h1>Welcome to servlet </h1>");
        pw.print("</body></html>");

    }

    @Override
    public String getServletInfo() {
        return "Servlet created by admin";
    }

    @Override
    public void destroy() {
        System.out.println("going to destroy servlet object...");
    }
}
