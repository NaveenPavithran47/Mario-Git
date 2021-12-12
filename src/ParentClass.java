
public class ParentClass {
	
	String str="Naveen";
	public ParentClass()
	{
		System.out.println("I'm Parent class Constructor");
	}

	public ParentClass(String str1)
	{
		System.out.println("Hi, my name is "+str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass p=new ParentClass("hi");
		
	}

}
