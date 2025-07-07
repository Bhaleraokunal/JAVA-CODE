import java.util.Scanner ;
class  Method1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int rev =0;
		if (prime (n))
		{
			for (int i=n;i>0 ;i/=10 )
			{
				rev=rev*10+(rev%10);
			}
		}
		if (n!=rev)
		{
			if (prime(rev))
			{
				System.out.println("It is twisted prime number ");
			}
		}
	
	
	public static boolean prime( int n )
	{
		int den = 2;
		boolean flag = false;
		while (den<n)
		{
			if (n%den==0)
			{
				break;
			}
		}
		if (n==den)
		{
			flag = true;
		}
	}
		
	}
}
