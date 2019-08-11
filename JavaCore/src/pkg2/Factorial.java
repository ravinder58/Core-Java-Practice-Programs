package pkg2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int fact=1;
		System.out.println("Please enter number of which you want factorial");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		for(int i=a;i>0;i--)
		{
			fact=fact*i;
		}

		System.out.println("Factorial of entered number is "+fact);
		
		scan.close();
	}

}
