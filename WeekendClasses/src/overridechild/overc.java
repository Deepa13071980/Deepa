package overridechild;

public class overc extends overp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overc ob1=new overc();
		ob1.parentclassarea(3);
		overp ob=new overp();
		ob.parentclassarea(4);

	}
public void parentclassarea(int a)
{
	System.out.println("The area of the rectangle=+a*4*2");
}
}
