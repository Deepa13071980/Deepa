package basics;

public class nonstaticpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstaticpara ob=new nonstaticpara();
				ob.rect(2,3);
				System.out.println(ob.area(2));
				ob.display("deepa", 34, "singaporel", 23);
				System.out.println(ob.div(4.0f, 2.0f));
	}
	
	public void rect(int a,int b)
	{
		System.out.println("The are of the rectangle"+a*b);
	}
private int area(int a)
{
	System.out.println("The are of the square");
	return a*a;
	}

public void display(String name,int a,String add,int length)
{
	System.out.println("The name is "+name);
	System.out.println("The age is "+a);
	
	System.out.println("The address  is "+add);
	
	System.out.println("The length is "+length);
	
	
	}
private float div(float a,float b)
{
return a/b;	
}


}
