package pkg1;

public class Assignment7 extends Assignment6 {

	
	public Assignment7(int a, int b, int c) 
	
	{   this();
		System.out.println("child 3 parameterized constructor");
	}
	
	public Assignment7(int a,int b)

	{   this(4,5,6);
		System.out.println("child 2 parameterized constructor");
		
	}
	public Assignment7(int a)
	{ 
		super(4,5);
		System.out.println("child 1 parameterized constructor");
	}
	
	public Assignment7()
	{   this(4);
		System.out.println("child Default constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment7 obj=new Assignment7(10,12);

	}

}
