package pkg2;

public class doubleloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number=1;
		for(int i=1;i<5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(number);
				number=number+1;
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
