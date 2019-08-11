package FileReadWrite;
import java.io.File;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.io.Writer;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlswrite {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException 
	{
		// TODO Auto-generated method stub
		xlswrite xw=new xlswrite();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired number of Rows and Columns in the sheet");
		int r=sc.nextInt();
		int c=sc.nextInt();
        xw.writeCellData(r,c);
		
		
		
		
	}
		
		
		public void writeCellData(int row, int column) throws WriteException, IOException
		{
		File f=new File("C:\\Users\\ROYAL COMPUTER\\Desktop\\Demo.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Data", 1);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{  System.out.println("Enter data for "+i +"th row and "+j+"th column");
			   String v=sc.nextLine();
			    Label l=new Label(j, i,v);
				ws.addCell(l);
				
			
		}
		
	
	}
		wk.write();  // To save the data;
		wk.close();
		sc.close();
}
}
