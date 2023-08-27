package basics;

public class operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=40,b=50,c=60,d=70;
a+=3;
b-=2;
c*=3;
d/=5;
/*System.out.println("The addition of 3 from age"+a);
System.out.println("The sub  of 2 from b"+b);
System.out.println("The product  of 3 to c"+c);
System.out.println("The div of 5  from age"+d);*/
System.out.println(a>18?"major":"minor");
System.out.println(a>10 && b<=50 );
System.out.println(a==40 && b<=50 );
System.out.println(a>=10 && b>=50 );
System.out.println(a!=10 && b>20 );
System.out.println("OR Operator");
System.out.println(a>10 || b<=50 );
System.out.println(a==40 || b<=50 );
System.out.println(a>=50 || b<=40);
System.out.println(a==10|| b==20);


	}

}
