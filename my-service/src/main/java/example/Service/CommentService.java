package example.Service;

import example.Entity.Comment;
import example.Util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.jws.WebService;
import java.util.List;

@WebService
public class CommentService {
    Transaction transaction = null;

    public Comment store(Comment comment) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(comment);
            transaction.commit();
            return comment;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
            return null;
        }
    }

    public List<Comment> getAll() {
        try (Session session = HibernateUtil.getSession()) {
            List<Comment> comments = session.createQuery("from Comment ", Comment.class).list();
            return comments;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Comment> getByPlaceId(long id) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Comment.class);
            return criteria.add(Restrictions.eq("place_id", id)).list();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Comment update(Comment comment) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.update(comment);
            transaction.commit();
            return comment;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

//    public Comment delete(long id) {
//        try (Session session = HibernateUtil.getSession()) {
//            transaction = session.beginTransaction();
//            Comment comment = session.get(Comment.class, id);
//            if (comment != null) {
//                comment.setStatus(Status.DELETED.getValue());
//                session.update(comment);
//            }
//            transaction.commit();
//            return comment;
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//            return null;
//        }
//    }

}
