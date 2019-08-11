package pkg1;

public class Assignment6 {

	
	public Assignment6(int a, int b, int c) 
	
	{   
		System.out.println(" parernt 3 parameterized constructor");
	}
	
	public Assignment6(int a,int b)

	{  this(5);
		System.out.println(" parernt 2 parameterized constructor");
		
	}
	public Assignment6(int a)
	{ 
		this();
		System.out.println(" parernt 1 parameterized constructor");
	}
	
	public Assignment6()
	{   this(4,5,6);
		System.out.println(" parernt Default constructor");
	}
	
	


	}


