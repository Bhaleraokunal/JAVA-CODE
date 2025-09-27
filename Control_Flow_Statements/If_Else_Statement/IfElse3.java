import java.util.Scanner;
class  IfElse3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter your second number :") ;
		int n2 = sc.nextInt();
		
		if (n1 == n2)
		{
			System.out.println("The number is equall ");
		}
		else
		{
			System.out.println("Ther number is no equall");
		}
		
	}
}
