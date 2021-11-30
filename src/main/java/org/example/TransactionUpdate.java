package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Ref;
import java.util.List;

public class TransactionUpdate extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ticket = request.getParameter("ticket");
        String status = request.getParameter("status");


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
        out.println("<th> Status </th>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<th>" + ticket + "</th>");
        out.println("<th>" + status + "</th>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");


        RefundImpl refund1 = new RefundImpl();
        RefundDao dao1 = RefundDao.getRefundDao();



        //dao1.getRefund(Integer.parseInt(ticket));

        //RefundImpl refund = (RefundImpl) session.get(RefundImpl.class, ticket);
        refund1.setTc_No(Integer.parseInt(ticket));
        refund1.setStatus(status);

        dao1.saveRefund(refund1);
        //out.println(dao3.getStatus(Integer.parseInt(ticket)));
        // refund1 = getTc_No(ticket);

        //dao1.statusChange(Integer.parseInt(ticket), status);

        //dao1.saveRefund(refund1);
        //refund1.setTc_No(Integer.parseInt(ticket));
        //refund1.setStatus(status);

        //dao1.updateRefund(refund1);

        //out.println(dao1.getRefund(Integer.parseInt(ticket)));
        //out.println(dao1.getRefunds());


        // dao1.getRefund(Integer.parseInt(ticket));
        //out.println("-----------------------" + dao1.getRefund(Integer.parseInt(ticket)) + "-----------------------");
        //out.println("------------------------All others Requests------------------------");
        /*List<RefundImpl> RefundImpl = dao1.getRefunds();
        for (RefundImpl refund : RefundImpl) {
            out.println(refund);
        }*/
    }
}