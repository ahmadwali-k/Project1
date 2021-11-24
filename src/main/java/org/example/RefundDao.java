package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * NaveBar
 *  - Home, Employe, Admin, Contact
 * Login (in demo)
 *  - apply for reimbusement
 *  - view past Tickets(approved/deny/pending)
 *  - Update request (cancel)
 *  - view request table
 * Registration
 *  - get info (save)
 *  - links to signIn page, home
 */

public class RefundDao {
    private static RefundDao dao1 = null;
    private Configuration configuration;
    private SessionFactory factory;


    private RefundDao() {
        configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        factory = configuration.buildSessionFactory();
    }

    public static RefundDao getRefundDao() {
        if (dao1 == null) {
            dao1 = new RefundDao();
        }
        return dao1;
    }

    // TODO: 11/19/2021 navbar

    // TODO: 11/19/2021 login


    // TODO: 11/19/2021 registration

    public RefundImpl getRefund(int tc_NO) {
        // fetching data from the database.
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        //Employee employee = (Employee) session.get(Employee.class, fname);


        RefundImpl refund = (RefundImpl) session.get(RefundImpl.class, tc_NO);
        transaction.commit();
        session.close();

        return refund;
    }

    public List<RefundImpl> getRefunds() {
        Session session = factory.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<RefundImpl> cq = cb.createQuery(RefundImpl.class);
        Root<RefundImpl> rootEntry = cq.from(RefundImpl.class);
        CriteriaQuery<RefundImpl> all = cq.select(rootEntry);

        TypedQuery<RefundImpl> allQuery = session.createQuery(all);
        List<RefundImpl> results = allQuery.getResultList();

        session.close();
        return results;
    }

    public void saveRefund(RefundImpl refund) {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();


        session.save(refund);
        transaction.commit();
        session.close();
    }

    public void updateRefund(RefundImpl r) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(r);

        transaction.commit();
        session.close();
    }

    /*public void deleteEmployee(String fname) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = getEmployee(fname);

        session.delete(employee);

        transaction.commit();
        session.close();
    }*/
}