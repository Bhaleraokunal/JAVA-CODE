import java.util.Scanner ; 
class SumOfAlternativeDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		int prod = 1 ;
		while (num!=0)
		{
			int last = num % 10 ;
			sum+=last ;
			 prod*=last;
			num/=100;
			count++;
		}
		
		System.out.println("The sum of the alternative number is :" + sum);
		System.out.println("The count of the alternative  number is :" + count);
		System.out.println("The product of the alternative number is :" + prod);
	}
}
