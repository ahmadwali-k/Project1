package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Refund extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ticket = request.getParameter("ticket");
        String amount = request.getParameter("amount");
        String reason = request.getParameter("reason");
        String description = request.getParameter("description");
        String status = "Pending";
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Employee </title");
        out.println("</head>");
        out.println("<body style=background-color:LightBlue;>");
        out.println("<h1> Request </h1>");
        out.println("<table border='1'>");
        out.println("<tr>");
        out.println("<th> Ticket No </th>");
        out.println("<th> Amount </th>");
        out.println("<th> Reason </th>");
        out.println("<th> Description </th>");
        out.println("<th> Status </th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<th>" + ticket + "</th>");
        out.println("<th>" + amount + "</th>");
        out.println("<th>" + reason + "</th>");
        out.println("<th> " + description + " </th>");
        out.println("<th>" + status + "</th>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

        RefundImpl refund = new RefundImpl();

        RefundDao dao1 = RefundDao.getRefundDao();
        refund.setTc_No(Integer.parseInt(ticket));
        refund.setAmount(Integer.parseInt(amount));
        refund.setReason(reason);
        refund.setDescription(description);
        refund.setStatus(status);
        dao1.saveRefund(refund);

    }
}
