import java.util.Scanner;
class CheckCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character :");
		char ch = sc.next().charAt(0);
		
		if (ch>= 'a' && ch <='z')
		{
			System.out.println("it is lowercase character");
		}
		else if (ch>='A' && ch<='Z')
		{
			System.out.println("It is uppercase character ");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("It is digit");
		}
		else 
		{
			System.out.println("It is a specical character");
		}
	}
}
