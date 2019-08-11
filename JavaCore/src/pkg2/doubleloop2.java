package pkg2;

public class doubleloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=9;
		for(int i=1;i<=r;i+=2)
		{
			for(int j=1;j<=(r-i)/2;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();

	}
		

}
}
