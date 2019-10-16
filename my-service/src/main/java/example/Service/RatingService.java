package example.Service;

import example.Entity.Rating;
import example.Util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import javax.jws.WebService;
import java.util.List;
@WebService
public class RatingService {
    Transaction transaction = null;

    public Rating store(Rating rating) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(rating);
            transaction.commit();
            return rating;

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
            return null;
        }
    }

    public List<Rating> getAll() {
        try (Session session = HibernateUtil.getSession()) {
            List<Rating> rating = session.createQuery("from Rating ", Rating.class).list();
            return rating;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<Rating> getByPlaceId(long id) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Criteria criteria = session.createCriteria(Rating.class);
            return criteria.add(Restrictions.eq("place_id", id)).list();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


    public Rating getById(long id) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Rating rating = session.get(Rating.class, id);
            return rating;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public Rating update(Rating rating) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.update(rating);
            transaction.commit();
            return rating;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }


}
