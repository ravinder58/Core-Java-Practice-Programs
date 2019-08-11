package pkg2;

public class listPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=5, end=50;
		
	    while(start<end)
		{  int flag=0;
			for(int i=2;i<=start/2;i++)
			{	if(start%i== 0)
				{  
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(start +" is prime number");
			}
			else
			{
				System.out.println(start +" is non prime number");
			}
			++start;
		}
		

	}

}
