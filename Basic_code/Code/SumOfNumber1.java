import java.util.Scanner ;
class SumOfNumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int start = 1 ;
		int sum = 0;
		
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		while (start<=num)
		{
			sum+=start;
			start++;
		}
		System.out.println("The value of sum is  :"+ sum);
	}
}
