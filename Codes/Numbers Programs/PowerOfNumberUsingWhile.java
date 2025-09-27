import java.util.Scanner ; 
class PowerOfNumberUsingWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your base value :");
		int base = sc.nextInt();
		
		System.out.println("Enter you raise value :");
		int raise = sc.nextInt();
		
		int power =1 ;
		while (raise > 0)
		{
			power = power * base ;
			
			raise -- ;
		};
			System.out.println("The Power of the number is :"+ power);
	}
}
