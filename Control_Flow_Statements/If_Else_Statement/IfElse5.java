import java.util.Scanner;
class  IfElse5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		
		int num = sc.nextInt();
		
		if (num%5==0)
		{
			System.out.println(" This number is multiple of 5");
		}
		else
			
		{
			System.out.println("The number is not Multiple of 5");
		}
	}
}
