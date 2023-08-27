package exception;

import java.util.Scanner;

public class e3 {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		if(age>18)
		{
			System.out.println("U r major");
		}
	else
	{
	throw new ArithmeticException("cant vote");	
	}
}
}
