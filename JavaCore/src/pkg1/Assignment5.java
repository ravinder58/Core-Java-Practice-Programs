package pkg1;

public class Assignment5 {
	
	public void method3(String a, String b, String c)
	
	{  this.method2("kite","runner");
		System.out.println("3 parameterized method");
		
	}
	public void method2(String a, String b)
	{
		System.out.println("2 parameterized method");
		
	}
	
	public void method1(String c)
	{
		this.method();
		System.out.println("1 parameterized method");
		
	}
	
	public void method()
	{  this.method3("ram", "b", "c");
		System.out.println("Default method");
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment5 obj=new Assignment5();
		obj.method1("abc");
		
		
		

	}

}
