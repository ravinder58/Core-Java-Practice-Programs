package pkg2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Readfile3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Readfile3 rf=new Readfile3();
		rf.writeLine();
		
	}
	
	public void writeLine() throws IOException
	{
		
		String s=null;
		File f=new File("C:\\Users\\ROYAL COMPUTER\\Desktop\\File.txt");
		FileWriter fr=new FileWriter(f);
		BufferedWriter br=new BufferedWriter(fr);
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{  System.out.println("Enter the "+i+" Line to be entered in the file");
			s=sc.nextLine();
			br.write(s);
			br.newLine();	
		}
		sc.close();
		br.close();
			
	}
}
