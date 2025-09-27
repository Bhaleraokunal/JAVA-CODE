import java.util.Scanner;
class SumOfDigit1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("-------------------Welcome------------------------");
		System.out.println("You can find the sum from 1 to your number");
		System.out.println("Enter you number :");
		
		int num  = sc.nextInt();
		int sum = 0;
		int start;
		
		for (start=1; start <=num; start++ )
		{
			sum+=start;
		}
		
		System.out.println("The sum of the number is :" + sum);
	}
}
