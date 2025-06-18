import java.util.Scanner ;
class ChekIfTheNumberIsPrimeInFibonacci
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		int n1=0,n2=1,res;
		
		for (int i=1;i<=num ;i++ )
		{
			res=n1+n2;
			if (n1==num)
			{
				break;
			}
			else if (n1>num)
			{
				System.out.println("It is a Fibonacci number but not a prime number");
				break;
			}
			n1=n2;
			n2=res;
		}
		if (n1==num)
		{
			int dm=2;
			for (;dm<n1 ;dm++ ) // insted of n1 you can use the num.
			{
				if (n1%dm==0)
				{
					break;
				}
			}
			if (n1==dm)
			{
				System.out.println("It is ture fibonaci prime number:");
			}
			else
			{
				System.out.println("It is not true fibonacci number:");
			}
		}
	}
}