import java.util.Scanner;
class IfElse4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter you age : ");
		byte age = sc.nextByte();
		
		if (age < 18)
		{
			System.out.println("Your eligible for voting");
		}
		else
		{
			System.out.println("Your are not eligible for voting");
			
		}
	}
}
