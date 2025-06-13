import java.util.Scanner ;
class SumOfEvenAndProdOfOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int sum = 0;
		int prod = 1;
		
		while (num!=0)
		{
			int last = num%10;
			if (last%2==0)
			{
				sum+=last;
			}
			else
			{
				prod*=last;
			}
			
			num/=10;
		}
		
		sum = sum<0 ? -(sum) : sum ;
		System.out.println("The sum of an even number is :" + sum);
		System.out.println("The prod of an odd number is :" + prod);
	}
}
