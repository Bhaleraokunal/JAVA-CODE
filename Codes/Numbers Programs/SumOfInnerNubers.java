import java.util.Scanner ;
class SumOfInnerNubers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		int sum = 0;
		int last = num%10;;
		int temp = num;
		int first = 0;
		while (temp>0)
		{
			int digit = temp%10;
			sum+=digit;
			first = digit ;
			temp/=10;
		}
		
		if (num<100)
		{
			System.out.println("No inner digit to sum");
		}
		else
		{
			int innerSum = sum-first-last;
			System.out.println("The sum of inner digit num is "+ innerSum);
		}
	}
}
