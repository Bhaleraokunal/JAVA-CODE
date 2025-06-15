import java.util.Scanner ;
class CountOfFactorAndFactorialCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int count = 0 ;
		int factorial=1;
		for (int dm=1;dm<=num ;dm++ )
		{
			if (num%dm==0)
			{
				count++;
			}
			
			factorial*=num;
		}
		int factCount = 0 ;
		for (int i=1;i<factorial ;i++ )
		{
			if (factorial%i==0)
			{
				factCount++;
			}
		}
	System.out.println("the count of an factor are :"+ count);	
	System.out.println("the count of an factorial are :"+ factCount);	
	}
	
}
