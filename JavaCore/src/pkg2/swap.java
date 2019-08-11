package pkg2;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first_number,second_number;
		int temp=0;
		System.out.println("Please enter Value of first number ");//Entering the value of a
		Scanner scan=new Scanner(System.in);
		first_number=scan.nextInt();
		System.out.println("Please enter Value of Second number ");//Entering the value of b
		second_number=scan.nextInt();
		temp=first_number;
		first_number=second_number;
		second_number=temp;
		System.out.println("New value of first number is "+ first_number);
		System.out.println("New value of Second number is "+ second_number);
	    scan.close();
		
		
		
		

	}

}
