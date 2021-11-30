package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DeleteRequest extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String ticket = request.getParameter("ticket");
        out.println("Ticket No: " + ticket +" removed successfully ");

        RefundImpl refund1 = new RefundImpl();
        RefundDao dao1 = RefundDao.getRefundDao();
        //refund1.setTc_No(Integer.parseInt(ticket));

        //out.println(dao1.getRefund(Integer.parseInt(ticket)));

        dao1.deleteRefund(Integer.parseInt(ticket));
        dao1.updateRefund(refund1);

        out.println(dao1.getRefund(Integer.parseInt(ticket)));

        out.println("-------------------All Requests after updates-----------------------");
        List<RefundImpl> RefundImpl = dao1.getRefunds();
        for (RefundImpl refund : RefundImpl) {
            out.println(refund);
        }
    }
}
