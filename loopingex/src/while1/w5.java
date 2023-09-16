package while1;

import java.util.Scanner;

public class w5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for ");
		s=sc.nextInt();
		if(s==1||s==2||s==3)
		{
			System.out.println("The season is Spring");
		}
		else if(s==4||s==5||s==6)
		{
			System.out.println("The season is summer");
		}
		else if(s==7||s==8||s==9)
		{
			System.out.println("The season is autumn");	
		}
		else
		{		
			System.out.println("The season is rainy");
		}

	}
}
