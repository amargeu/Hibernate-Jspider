import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch 
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure();

		System.out.println("configuraton done");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println("factory done");

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Human h1=session.get(Human.class,new Integer(3));
		System.out.println(h1);
		
		session.update(h1);
		h1.setName("soumen");
		transaction.commit();
		System.out.println("updated record..."+h1);
		
		
          
		
	}

}
