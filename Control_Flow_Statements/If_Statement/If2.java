import java.util.Scanner;
class If2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Are you a paid student ?");
		
		boolean ip = sc.nextBoolean();
		
		if (ip)
		{
			System.out.println("Pay the fees");
		}
		
		System.out.println("Do the classes ");
		
	}
}
