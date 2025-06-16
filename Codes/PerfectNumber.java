import java.util.Scanner ;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int sum = 0 ;
		
		for (int i=1;i<=num/2 ;i++ )
		{
			if(num%i==0)
				sum+=i;
		}
		if (sum==num)
		{
			System.out.println("It is a perfect number");
		}
		else
		{
			System.out.println("It is not a perfect number ");
		}
	}
}
