package Bac2;

import encap.en1;

public class dowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		do
		{
			System.out.println(i);
			i+=1;
			
		}while(i<=13);
		
		int b=5;
		do
		{
			System.out.println(b);
			b+=5;
			
		}while(b<=50);
		
		System.out.println("from 100 to 80");
		for(int c=100;c>=80;c-=2)
		{
			
			System.out.println(c);
		}
		
		System.out.println("from 80 to 100");
		for(int c=80;c<=100;c+=2)
		{
			
			System.out.println(c);
		}
		
		en1 ob=new en1();
		ob.set("deepa");
		ob.get();
		
		}

	}
	
		// TODO Auto-generated method stub

	

