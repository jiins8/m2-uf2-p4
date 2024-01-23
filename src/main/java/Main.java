import jakarta.persistence.Entity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

    public static void main(String[] args) {
        var em = entityManagerFactory.createEntityManager();
        System.out.println(em.getProperties());

        var empleat = new Empleat();
        empleat.setId(1);
        empleat.setNom("empleat1");
        empleat.setSalari(2000);

        var director = new Director();
        director.setId(2);
        director.setNom("director1");
        director.setSalari(3000);
        director.setPressupostAnual(20000);

        var becari = new Becari();
        becari.setId(3);
        becari.setNom("becari1");
        becari.setNota(7.5);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(empleat);
        em.persist(becari);
        em.persist(director);
        transaction.commit();

    }
}
