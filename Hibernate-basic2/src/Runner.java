
	import java.io.Serializable;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class Runner {

		public static void main(String[] args) {

			Configuration cfg = new Configuration();
			cfg.configure();

			System.out.println("configuraton done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			System.out.println("factory done");

			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			Human modi = new Human();
			modi.setName("amar");
			
			
			 Serializable pk = session.save(modi);
			 
			 Integer xyz = (Integer) pk;
			 int abz = xyz;
			 
			 System.out.println(xyz);
			 
			 int pk1 = (int)session.save(modi);
			transaction.commit();
			
		}
}
