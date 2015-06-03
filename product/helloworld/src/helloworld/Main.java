package helloworld;

public class Main {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("hello world");
		}
		catch(Exception ex)
		{
			ex.printStackTrace(System.out);
		}
	}
}
