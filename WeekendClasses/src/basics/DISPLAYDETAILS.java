package basics;

public class DISPLAYDETAILS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DISPLAYDETAILS.show();
		DISPLAYDETAILS.biggest();
		
		nonstatic ob=new nonstatic();
		ob.rect();

	}
	public static void show()
	{
		String Name="deepa";
		int age=34;
		String add="34.Yishun";
		System.out.println("My name is :"+Name);
		System.out.println("My Age is :"+age);
		System.out.println("My address is :"+add);
	}
protected static void biggest()
{
	int a=20;
	int b=34;
	System.out.println("The biggest of two numbers is:"+a +"and"+b+"is  " +(a>b?a:b));
}

}
