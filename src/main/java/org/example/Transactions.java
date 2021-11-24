package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Transactions extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ticket = request.getParameter("ticket");
        out.println("Ticket No: " + ticket);


        RefundImpl refund1 = new RefundImpl();
        RefundDao dao1 = RefundDao.getRefundDao();
        refund1.setTc_No(Integer.parseInt(ticket));
       // dao1.getRefund(Integer.parseInt(ticket));

        out.println("    --------------------    "+dao1.getRefund(Integer.parseInt(ticket))+ "-----------------------");

        out.println("---------------------------All others Requests---------------------------------");
        List<RefundImpl> RefundImpl = dao1.getRefunds();
        for (RefundImpl refund : RefundImpl) {
            out.println(refund);
        }
       /* RequestDispatcher rd = request.getRequestDispatcher("transaction.html");
        rd.forward(request, response);
        response.sendRedirect("transaction.html");*/



        /*
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Employee </title");
        out.println("</head>");
        out.println("<body style= background-color:LightBlue;>");
        out.println("<h1> Employee table </h1>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th> Ticket No </th>");
        out.println("<th> Amount </th>");
        out.println("<th> Description </th>");
        out.println("<th> Reason </th>");
        out.println("<th> Status </th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<th>" + tc_No + "</th>");
        out.println("<th>" + amount + "</th>");
        out.println("<th> " + description + " </th>");
        out.println("<th> " + reason + " </th>");
        out.println("<th> " + status + " </th>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");*/
    }
}
