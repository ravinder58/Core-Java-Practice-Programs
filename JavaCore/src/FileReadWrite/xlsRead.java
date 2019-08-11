package FileReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsRead {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		xlsRead xr=new xlsRead();
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the row number and column number which you want to access");
		
		int r=scan.nextInt();
		int c=scan.nextInt();
		System.out.println("The required cell value is :\n" +xr.excelRead(r,c));
		
	}
		
		public String excelRead(int row_no,int column_no) throws BiffException, IOException
		{  
			String req_string=null;
			File f=new File("C:\\Users\\ROYAL COMPUTER\\Desktop\\Demo.xls");
			Workbook wb=Workbook.getWorkbook(f);
			Sheet ws=wb.getSheet(0);
			int row_count=ws.getRows();
			int column_count=ws.getColumns();
			for(int i=0;i<=row_count;i++)
			{
				for(int j=0;j<=column_count;j++)
				{
					if(i==row_no && j==column_no)
					{
						Cell c1=ws.getCell(j,i);
						req_string=c1.getContents();
					}
				}
			}
			return req_string;
			
		}

	} 


