package pkg2;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int original_number;
		int remainder;
		int rev=0;
		System.out.println("Please enter Value of the number to be checked for palindrome");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		original_number=a;
		while(a>0)
		{
			remainder=a%10;
			rev=rev*10+remainder;
			a=a/10;
		}
	    
		if(rev==original_number)
		{
			System.out.println(original_number +" is a palindrome.");
		}
		else
		{
			System.out.println(original_number +" is not a palindrome");
		}

	}

}
