package org.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TransactionUpdate extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ticket = request.getParameter("ticket");
        String status = request.getParameter("stutus");
        String amount = request.getParameter("amount");
        String reason = request.getParameter("reason");
        String description = request.getParameter("description");



        //out.println("New Status: " + status);


        RefundImpl refund1 = new RefundImpl();
        RefundDao dao1 = RefundDao.getRefundDao();
        refund1.setTc_No(Integer.parseInt(ticket));
        refund1.setStatus(status);
        refund1.setReason(refund1.getReason());
        refund1.setDescription(refund1.getDescription());
        refund1.setAmount(refund1.getAmount());
        //dao1.updateRefund(refund1);
        out.println(dao1.getRefunds());

        // dao1.getRefund(Integer.parseInt(ticket));
        //out.println("-----------------------" + dao1.getRefund(Integer.parseInt(ticket)) + "-----------------------");
        //out.println("------------------------All others Requests------------------------");
        /*List<RefundImpl> RefundImpl = dao1.getRefunds();
        for (RefundImpl refund : RefundImpl) {
            out.println(refund);
        }*/
    }
}