package pkg2;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a;
        System.out.println("Enter the number for which you want Table");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
        	System.out.println(a+"  X  " +i+" = "+a*i);
        }
    
	}

}
