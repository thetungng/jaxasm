package example.Service;

import example.Entity.City;
import example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.jws.WebService;
import java.util.List;

@WebService
public class CityService {
    Transaction transaction = null;

    public City store(City city) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(city);
            transaction.commit();
            return city;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
            return null;
        }
    }

    public List<City> getAll() {
        try (Session session = HibernateUtil.getSession()) {
            List<City> cities = session.createQuery("from City ", City.class).list();
            return cities;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public City getById(long id){
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            City city = session.get(City.class, id);
            return city;
        }catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public City update(City city) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.update(city);
            transaction.commit();
            return city;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

//    public City delete(long id) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSession()) {
//            transaction = session.beginTransaction();
//            City city = session.get(City.class, id);
//            if (city != null) {
//                city.setStatus(Status.DELETED.getValue());
//                session.update(city);
//            }
//            transaction.commit();
//            return city;
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//            return null;
//        }
//    }

}
