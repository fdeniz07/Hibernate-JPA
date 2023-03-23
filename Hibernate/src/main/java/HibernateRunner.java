import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateRunner {

    public static void main(String[] args) {

        Personel personel1 = new Personel();

        personel1.setPersonelId(1);
        personel1.setPersonelAdi("John");
        personel1.setPersonelSoyadi("Rambo");

        //---------------------------------------------
        Configuration con = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Personel.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(personel1);
        session.getTransaction().commit();


    }
}
