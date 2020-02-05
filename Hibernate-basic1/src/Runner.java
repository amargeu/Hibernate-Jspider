
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Runner
{
	public static void main(String[] args) 
	{
      Configuration cfg=new Configuration();
       cfg.configure();
      System.out.println("config done");
      cfg.buildSessionFactory();
      System.out.println("session factory built");
      SessionFactory sessionFactory =cfg.buildSessionFactory(); 
        Session session=sessionFactory.openSession();
        System.out.println("session created");
        Transaction transaction=session.beginTransaction();
        System.out.println("transaction done");
        
    Mobile apple=new Mobile();
        apple.setId(1);
        apple.setPrice(67000.0);
        apple.setBrand("Apple");
        apple.setRamsize(8);
        System.out.println("query executed");
         
        session.save(apple);
        transaction.commit();
        
        Mobile vivo=new Mobile();
        vivo.setId(2);
        vivo.setPrice(8000.0);
        vivo.setBrand("vivo");
        vivo.setRamsize(8);
        System.out.println("query executed");
         
        session.save(vivo);
        transaction.commit();
        Mobile samsung=new Mobile();
        samsung.setId(4);
        samsung.setPrice(11000.0);
        samsung.setBrand("samsang");
        samsung.setRamsize(4);
        System.out.println("query executed");
         
        session.save(samsung);
        transaction.commit();
        session.delete(apple);
        
        
        }

}
