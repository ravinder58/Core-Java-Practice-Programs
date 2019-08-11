package pkg2;

import java.util.Scanner;

import javax.security.auth.callback.ChoiceCallback;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int original_number;
		int check_arm=0;
		int remain;
		System.out.println("Enter the number you want to check for Armstrong");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        original_number=a;
        while(a>0)
        {
        	remain=a%10;
        	check_arm=check_arm+remain*remain*remain;
        	a=a/10;
        }
        
        if(original_number==check_arm)
        {
        	System.out.println("Number is armstrong");
        }
        
        else
        {
        	System.out.println("Number is not armstrong");
        }
	}

}
