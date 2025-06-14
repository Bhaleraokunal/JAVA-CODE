import java.util.Scanner ;
class FactorialOfNumberUsingFor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter you number :");
		int num = sc.nextInt();
		
		int factorial = 1;
		
		for (;num!=0;num-- )
		{
			factorial = factorial*num;
		}
		System.out.println("The factorial of a number is :"+factorial);
	}
}
