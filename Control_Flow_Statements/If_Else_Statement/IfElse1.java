import java.util.Scanner;
class IfElse1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		if (num%3==0)
		{
			System.out.println(num + "This number is divisible by 3");
		}
		else
		{
		System.out.println(num + "This number is not divisble by 3");
		}
	}
}
