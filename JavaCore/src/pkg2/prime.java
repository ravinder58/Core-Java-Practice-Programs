package pkg2;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int flag=0;
		System.out.println("Please enter Value of the number to be checked for prime");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		if((a==0)||(a==1))
		{
			System.out.println(a +"  is not prime number");
		}
		else 
		{
		 for(int i=2;i<=a/2;i++)              //checking the number is divisible upto half of the number.
		 {
		    if(a%i==0)
		    {
			System.out.println(a +"  is not prime number");
			flag=1;
			break;
			}
		 }
		 
		 if(flag==0)
		 {
			 System.out.println(a +" is prime number");
		 }
		 
		}
		 
	
     scan.close();
	}
}





