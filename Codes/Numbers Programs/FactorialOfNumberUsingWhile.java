import java.util.Scanner ;
class FactorialOfNumberUsingWhile 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		int factorial = 1;
		
		while (num!=0)
		{
			factorial *= num ;
			num--;
		}
		System.out.println("The factorial value is:"+ factorial);
	}
}
