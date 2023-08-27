package Lambda;

public class lambconclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ab1 ob=()->
{
	System.out.println(" Calling interface using Lambda");
};
ob.m1();
ab2 ob1=(s)->
{
	System.out.println("The name is"+s);
};
ob1.m2("Deepa");

ab3 ob2=(a,b)->(a+b);

	System.out.println("the addition of two number"+ob2.m3(4,5));


}
	}


