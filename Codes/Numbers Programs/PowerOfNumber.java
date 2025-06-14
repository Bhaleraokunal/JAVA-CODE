import java.util.Scanner ;
class PowerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your base value :");
		int base = sc.nextInt();
		
		System.out.println("Enter you raise value :");
		int raise = sc.nextInt();
		
		int power = 1;
		
		for (int i=0;i<raise ;i++ )
		{
			power = power * base;
		}
		System.out.println("The Power of the number is :"+power);
	}
}
