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

        out.println(dao1.getRefund(Integer.parseInt(ticket)));

        out.println("-------------------All other Requests-----------------------");
        List<RefundImpl> RefundImpl = dao1.getRefunds();
        for (RefundImpl refund : RefundImpl) {
            out.println(refund);
        }
       /* RequestDispatcher rd = request.getRequestDispatcher("transaction.html");
        rd.forward(request, response);
        response.sendRedirect("transaction.html");*/

    }
}
