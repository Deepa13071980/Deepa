package exception;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.err.println(3/0);
		}
		catch(Exception e)

		{
			System.out.println("error"+e);
		}
		finally
		{
			System.out.println("Welcome");
		}
	}

}
