package super1;

public class superchild extends superparent{
	int age=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superchild ob=new superchild();
		ob.display();

	}

	public void display()
	{
		System.out.println(" The age of the child"+age);
		System.out.println(" The age of the child"+super.age);
	}
}
