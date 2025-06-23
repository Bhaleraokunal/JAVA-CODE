import java.util.Scanner ; 
class TwistedPrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int rev = 0 ;
		int dm = 2;
		while (dm<num)
		{
			if (num%dm==0)
			{
				break;
			}
			dm++;
		}
		if (num==dm)
		{
			System.out.println("it is prime");
			int temp=num;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		if (temp==rev)
		{
			int dm1 = 2;
		while (dm<num)
		{
			if (num%dm1==0)
			{
				break;
			}
			dm++;
		}
		}
		}
		
		
	}
}
