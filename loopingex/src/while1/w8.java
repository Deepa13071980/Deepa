package while1;

import java.util.Scanner;

public class w8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for string1");
		String s=sc.nextLine();
		System.out.println("enter the value for string2");
		String s2=sc.nextLine();
		System.out.println("enter the value for string3");
		String s3=sc.nextLine();
System.out.println("The value of S="+s);
System.out.println("The value of S2="+s2);
System.out.println("The value of S3="+s3);
	switch(s)
	{

	case "deepa":
		System.out.println("The name  is"+s);
		System.out.println("Enter the age");
		int i=sc.nextInt();
		
			switch(i)
			{
			case 40:
				System.out.println("The age is 40");
				break;
			case 41:
				System.out.println("The age is 41");
				break;
			case 42:
				System.out.println("The age is 42");
				break;
			case 43:
				System.out.println("The age is 43");
				break;
			case 44:
				System.out.println("The age is 44");
				break;
							
			
		}
			
		break;
		case "lakshmi":
			System.out.println("The name  is"+s);
			break;
			default:
				System.out.println("not in the list");
		
			}
	}

}
