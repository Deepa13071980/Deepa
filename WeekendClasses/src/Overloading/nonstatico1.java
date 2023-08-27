package Overloading;

public class nonstatico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nonstatico1 obj=new nonstatico1();
obj.area(3);
obj.area(2, 2.30);
obj.area(2.3, 2.3f);
	}

	
	public void area(int a)
	{
		System.out.println("The area of the square="+a*a);
	}
	public void area(int a,double d)
	{
		System.out.println("The area of the circle="+3.14*a*d);
	}
	public void area(double d,float f)
	{
		System.out.println("The area of the triangle="+.5*d*f);
	}
	
	
	}
	

