package pkg2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.security.auth.callback.ChoiceCallback;

public class Readfile2 {

	public static void main(String[] args) throws IOException {
		
		Readfile2 rf=new Readfile2();
		System.out.println("Enter the number from you want to read");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Enter the number upto which you want to read");
		int b=scan.nextInt();
		System.out.println(rf.readLine(a,b));	
	}
	 
	public String readLine(int initialLine,int endLine) throws IOException
	{
		File f=new File("C:\\Users\\ROYAL COMPUTER\\Desktop\\File.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int r=0;
		String req_String=null;
		String s;
		while((s=b.readLine())!=null)
		{
			++r;
			for(r=initialLine;r<=endLine;r++)			
			{
				req_String=s;
			}
			
		}
		
		return req_String;
		
	}

}
