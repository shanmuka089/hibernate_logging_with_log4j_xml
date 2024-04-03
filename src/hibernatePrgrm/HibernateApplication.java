package hibernatePrgrm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateApplication {

	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate-cfg.xml").build();
		Metadata metadata = new MetadataSources(registry).buildMetadata();
		
		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		BookPojo bookPojo = new BookPojo();
		
		bookPojo.setName("Theory Of General Relativity");
		bookPojo.setAuthor("Einstine");
		bookPojo.setPrice(500.0);
		
		session.save(bookPojo);
		
		transaction.commit();
		
		sessionFactory.close();
		
		session.close();
	}

}
