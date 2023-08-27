package exception;

 class MyException extends Exception {
	
	private int detail;
	MyException(int a)
	{
		detail=a;
		
	}
public String toString()
{
	return "MyException["+detail+"]";
}
}
class except
{
	static void compute(int a) throws MyException
	{
		System.out.println("called compute"+a);
	
	if(a>10)
		throw new MyException(a);
	System.out.println("Normal exit");
	}

	
		
	public static void main(String[] args) 
	{

		try{
			compute(1);
			compute(23);// TODO Auto-generated method stub
			}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
