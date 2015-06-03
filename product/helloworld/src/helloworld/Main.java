package helloworld;

public class Main {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("hello world");
			System.out.println("hello eclipse");
		}
		catch(Exception ex)
		{
			ex.printStackTrace(System.out);
		}
	}
}
