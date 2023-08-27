package Overloading;

public class consover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		consover a=new consover();
		consover a1=new consover(3);
		consover a2=new consover(2,3.5);
		
	}

	public consover()
	{
		System.out.println("The rreturn type of this method is null");
	}
	
	public consover(int a)
	{
		System.out.println("The area of the square"+a*a);
	}
	public consover(int a,double d)
	{
		System.out.println("The area of the triangle"+a*d*0.5);
	}
	
}
