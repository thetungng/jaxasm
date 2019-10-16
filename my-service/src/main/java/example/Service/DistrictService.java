package example.Service;

import example.Entity.District;
import example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.jws.WebService;
import java.util.List;
@WebService
public class DistrictService {
    Transaction transaction = null;

    public District store(District district) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(district);
            transaction.commit();
            return district;
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
            return null;
        }
    }

    public List<District> getAll() {
        try (Session session = HibernateUtil.getSession()) {
            List<District> districts = session.createQuery("from City ", District.class).list();
            return districts;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public District getById(long id) {
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            District district = session.get(District.class, id);
            return district;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public District update(District district) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            session.update(district);
            transaction.commit();
            return district;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

//    public District delete(long id) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSession()) {
//            transaction = session.beginTransaction();
//            District district = session.get(District.class, id);
//            if (district != null) {
//                district.setStatus(Status.DELETED.getValue());
//                session.update(district);
//            }
//            transaction.commit();
//            return district;
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//            return null;
//        }
//    }

}
