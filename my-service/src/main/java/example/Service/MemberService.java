package example.Service;

import example.Entity.Member;
import example.Util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.jws.WebService;

@WebService
public class MemberService {
    private SessionFactory sessionFactory;

    public Member login(String username, String password) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Member.class);
        Member currentMember = (Member) criteria.add(Restrictions.eq("username", username)).uniqueResult();
        if (currentMember == null) {
            return null;
        } else {
            if (!currentMember.getPassword().equals(password)) {
                return null;
            } else {
                return currentMember;
            }
        }
    }

    public Member register(Member member) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(member);
            // commit transaction
            transaction.commit();
            return member;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

}
