package Practice;
public class Singleton {

	private static Singleton instance;
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(instance==null)
		{
		 instance = new Singleton();
		
		}
		return instance;
	}
	public static void main(String[] args)
	{
		Singleton obj=Singleton.getInstance();
		System.out.println("The Instance value is" + obj);
	}
}
