package pkg1;

public class Assignment1 {

	
	public int sum(int a,int b)
	{
		int add=a+b;     //adding two numbers
		return add;
	}
   public int subtraction(int a,int b)	{
	   int  sub=a-b;   //subtracting two numbers
	   return sub;
       }
   
   public int divsion(int a,int b)
   {
	   int div=a/b;    //division of two nunmbers
	   return div;
   }
   
   public int multiply(int a,int b)
   {
	   int mul=a*b;
	   return mul;     //Multiplication of two numbers
	   
   }
   
   public static void main(String args[])
   {
	   Assignment1 obj=new Assignment1();
	   int add=obj.sum(10, 2);                 //(10+2)
	   int diff= obj.subtraction(add,2);       //((10+2)-2)
	   int add1=obj.sum(diff,2);               //(((10+2)-2)+2)	   
	   int multi=obj.multiply(add1, 2);        //((((10+2)-2)+2)*2)
	   int Solution=obj.divsion(multi,2);       //(((((10+2)-2)+2)*2)/2
	   System.out.println("The result of expression is " + Solution);
   }
   
	  
	  
	   
	 
   }
   

	
	
	

