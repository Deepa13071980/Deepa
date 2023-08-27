package multi;

public class multclas1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		multclas1 ob=new multclas1();
		Thread t1=new Thread(ob);
		t1.start();
		multclas1 ob1=new multclas1();
		Thread t11=new Thread(ob1);
		t11.start();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Task 1");
	}

}
