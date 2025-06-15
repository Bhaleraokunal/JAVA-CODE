import java.util.Scanner ;
class SumOfFactorOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int sum = 0 ;
		
		for (int dm=1;dm<=num ;dm++ )
		{
			if (num%dm==0)
			{
				sum+=dm;
			}
		}
		System.out.println("The sum of the factor of an number is :"+sum);
	}
}
