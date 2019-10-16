package example.Service;

import com.google.gson.Gson;
import example.Entity.City;
import example.Entity.District;
import example.Entity.Place;
import example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class PlaceService {
    Transaction transaction = null;

    @WebMethod
    public Place store(Place place) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(place);
            transaction.commit();
            return place;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
            return place;
        }
    }

    @WebMethod
    public List<Place> getAll() {
        try (Session session = HibernateUtil.getSession()) {
            List<Place> places = session.createQuery("from Place ", Place.class).list();
            return places;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @WebMethod
    public Place getById(long id) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            Place place = session.get(Place.class, id);
            return place;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @WebMethod
    public Place update(Place place) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.update(place);
            transaction.commit();
            return place;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    @WebMethod
    public List<City> getAllCity() {
        List<City> cityList = HibernateUtil.getSession().createQuery("from City ", City.class).list();
        return cityList;
    }

    @WebMethod
    public List<District> getAllDistrict() {
        List<District> districtList = HibernateUtil.getSession().createQuery("from District ", District.class).list();
        return districtList;
    }
//    public Place delete(long id) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSession()) {
//            transaction = session.beginTransaction();
//            Place place = session.get(Place.class, id);
//            if (place != null) {
//                place.setStatus(Status.DELETED.getValue());
//                session.update(place);
//            }
//            transaction.commit();
//            return place;
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//            return null;
//        }
//    }

}
