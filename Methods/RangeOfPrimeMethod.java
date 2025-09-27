import java.util.Scanner ;
class RangeOfPrimeMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your starting number :");
		int n1 = sc.nextInt();
		System.out.println("Enter your ending number :");
		int n2 = sc.nextInt();
		
		rangePrime(n1,n2);
	}
	
	
	public static boolean isPrime(int n)
	{
		if (n<=1)
		{
			return false;
		}
		int den= 2 ;
		while (den<n)
		{
			if (n%den==0)
			{
				return false;
			}
			den++;
		}
		return true;
	}
	
	public static void rangePrime(int start, int end )
	{
		
		while (start <= end)
		{
			if (isPrime(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
