import java.util.Scanner;
class  IfElse2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your character : ");
		
		char  cha = sc.next().charAt(0);
		
		if (cha =='a' || cha=='e' || cha=='i' || cha =='o' || cha=='u' || cha =='A' || cha=='E' || cha=='I' || cha =='O' || cha=='U')
		{
			System.out.println(cha + " " + "The character is vowel");
		}
		else
		{
			System.out.println(cha + " " + "The character is consonet");
		}
	}
}
