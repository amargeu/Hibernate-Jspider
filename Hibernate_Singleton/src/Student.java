
public class Student
{
	private static Student s;
	static
	{
		s=new Student();
	}
	
	private Student()
	{
		super();
		
	}
	public final synchronized static Student studentFactory()
	{
		return s;
	}

}
