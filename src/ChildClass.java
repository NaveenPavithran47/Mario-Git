
public class ChildClass extends ParentClass{

	public ChildClass()
	{
		super("");
		System.out.println("I'm child class Constructor");
	}
	
	public ChildClass(int a, int b)
	{
		super();
		int c= a+b;
		System.out.println(c);
	}
	
	public void getData()
	{
		System.out.println("First Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass c=new ChildClass();
		c.getData();
		ChildClass pp=new ChildClass(10,20);
		
		
	}

}
