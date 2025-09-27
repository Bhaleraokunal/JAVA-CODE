import java.util.Scanner ;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		if (isHarshad(n))
		{
			System.out.println("It is a Harshad number ");
		}
		else
			System.out.println("It is not a harshad number ");
	}
	
	public static boolean isHarshad(int n)
	{
		int sum = 0;
		for (int i=n;i>0 ;i/=10 )
		{
			sum+=i%10;	
		}
		
		return n%sum==0;
	}
}
