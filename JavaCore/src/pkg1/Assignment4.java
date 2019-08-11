package pkg1;

public class Assignment4 {

	
	public Assignment4(int a, int b, int c) 
	
	{   
		System.out.println("3 parameterized constructor");
	}
	
	public Assignment4(int a,int b)

	{  this();
		System.out.println("2 parameterized constructor");
		
	}
	public Assignment4(int a)
	{ 
		this(4,5,6);
		System.out.println("1 parameterized constructor");
	}
	
	public Assignment4()
	{   this(4);
		System.out.println("Default constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment4 obj=new Assignment4(10,12);

	}

}
