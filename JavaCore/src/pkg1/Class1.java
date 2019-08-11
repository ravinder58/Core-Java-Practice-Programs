package pkg1;

public class Class1 {
	
	int age;                    //Declaration of variables
	int roll_no;
	
	public void display1()
	{
		System.out.println("Welcome to Selenium class");    //Printing of the message 
	}

	
	public void display2()
	{
		System.out.println("Welcome to Gurugram");           //Printing of the message
		
		
	}
	
	public static void main(String args[])
	{
		Class1 deepak=new Class1();
		deepak.age=25;
		deepak.roll_no=30;
		System.out.println("The value of age is " +deepak.age);
		System.out.println("The value of roll_no is " +deepak.age);
		
		deepak.display1();
		deepak.display2();
		
		
	}
}
