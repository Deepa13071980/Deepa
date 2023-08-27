package basics;

public class nonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nonstatic ob=new nonstatic();
ob.rect();
ob.circle();
ob.average();
ob.product();
System.out.println("The addition of two number"+ob.add());
System.out.println("The addition of two number"+ob.wish());
System.out.println("The age is"+ob.age());
System.out.println("The area is"+ob.area());
	}


public void rect()
{
	float a=3.14f;
	float b=4.15f;
	System.out.println("The area of the rectangle"+a*b);
}
private void circle()
{
	double d=4.5;
	System.out.println("The area of the circle="+22/7*d*d);
}
public void average()
{
	int a=20;
	int b=50;
	int c=100;
	int d;
	d=a+b+c/3;
	System.out.println("The average of 3 numbers"+d);
}
private void product()
{
	int a=5;
	int b=6;
	System.out.println("The product of two numbers="+a*b);
	}
public int add()
{
	int a=35;
	int b=45;
	return a+b;
}
private String wish()
{
	String d="deepa";
			return d+"all";
			}
public int age()
{
int a=56;
return a;
}
private float area()
{
	float t=3.23f;
	float d=4.5f;
	float a=0.5f*t*d;
	return a;


}



}

