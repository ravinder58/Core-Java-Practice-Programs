package pkg2;

import java.util.Scanner;

public class swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Please enter Value of first number ");//Entering the value of a
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		System.out.println("Please enter Value of Second number ");//Entering the value of b
		b=scan.nextInt();
		if(a>b)
		{
			a=a-b;
			b=a+b;
			a=b-a;
		}
		else if(b>a){
			b=b-a;
			a=a+b;
			b=a-b;
			
		}
			
		
		System.out.println("New value of first number is "+ a);
		System.out.println("New value of Second number is "+ b);
	    scan.close();
		
		
		
		

	}

}
