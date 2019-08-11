package pkg1;

public class Assignment3 {

	
	public void division(int a, int b)
	{
		int div=a/b;
		System.out.println("Result of the expression is " +div);
	}
	
	public int subtraction(int a,int b)
	{
		int sub=a-b;
		return sub;
		
	}
	
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}

	public int multi(int a,int b)
	{
		int mul=a*b;
		return mul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Assignment3 obj=new Assignment3();
     //Object creation.
     int diff1=obj.subtraction(10, 2);
     int add1=obj.add(diff1, 2);
     int diff2=obj.subtraction(add1,2);
     int multi1=obj.multi(diff2,2);
     obj.division(multi1, 2);
     
	}
	

}
