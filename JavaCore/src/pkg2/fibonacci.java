package pkg2;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int n1=0,n2=1,n3;
		System.out.println("Please enter desired number of fibonacci wanted");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		System.out.print(n1+" "+n2); //printing 0 and 1
		
		for(int i=2;i<a;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	    scan.close();

	}

}
