import java.util.Scanner ;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int count = 1;
		
		for (int i=1;i<=num/2 ;i++ )
		{
			if(num%i==0)
				count++;
		}
		if (count==2)
		{
			System.out.println("It is a prime number ");
		}
		else
		{
			System.out.println("It is not prime number ");
		}
	}
}
