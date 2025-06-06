import java.util.Scanner;
class If3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your bill amount:");
		
		double amt = sc.nextDouble();
		
		if (amt > 1000)
		{
			amt = amt - (amt*0.1);
			System.out.println("Offer Applied" );
		}
		System.out.println("Pay the Bill: " + amt);
	}
}
