import java.util.Scanner ;
class SumOfInner 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
				num/=10;
		int rev = 0 ;
		int temp = num;
		int sum = 0 ;
		while (temp>0)
		{
			rev=rev*10+temp%10;
			temp/=10;
		}
		rev/=10;
		int innerSum=0;
		while (rev>0)
		{
			innerSum = innerSum+rev%10;
			rev/=10;
		}
		
		if (num<100)
		{
			System.out.println("No inner number to sum :");
		}
		else
		{
			System.out.println("The summ of inner digit is "+ innerSum);
		}
	}
}
