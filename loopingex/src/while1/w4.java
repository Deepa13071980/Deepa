package while1;

import java.io.IOException;


public class w4 {

	public static void main(String[] args)throws IOException{
		char choice;
		 
		do
		{
			System.out.println("Help on");
			System.out.println("1.If");
			System.out.println("2.Switch");
			System.out.println("3.While");
			System.out.println("4.Do-While");
			System.out.println("5.For");
			System.out.println("Choose any");
			choice=(char)System.in.read();//dangerous input method
			System.out.println("the value for choice"+choice);
			
			
			
		}while(choice<'1'||choice>'5');
		
		switch(choice)
		{
		case '1':
			System.out.println("if statement");
			break;
		case '2':
			System.out.println("switch statement");
			break;
		case '3':
			System.out.println("while statement");
			break;
		case '4':
			System.out.println("do while  statement");
			break;
		case '5':
			System.out.println("for statement");
			break;
			
			
		}
		

	}

}
