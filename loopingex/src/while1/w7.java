package while1;

import java.io.IOException;


public class w7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

char c,d;
System.out.println("Enter the value for c");
c=(char)System.in.read();

System.in.read();//these lines avoid read ascii value to get the value for d
System.in.read();
System.out.println("Enter the value for d");
d=(char)System.in.read();
System.out.println("The value for c is"+c);
System.out.println("The value for d is "+d);
switch(c) {
case 'a':
	System.out.println("The value is apple");
	break;
	
case 'b':
	System.out.println("The value is banana");
	break;
case 'c':
	System.out.println("The value is carrot");
	break;
case 'd':
	System.out.println("The value is dumplin");
	break;
case 'e':
	System.out.println("The value is grapes");
	break;
default:
	System.out.println("The value is anything");
	break;
		
	
	
}
	}

}
