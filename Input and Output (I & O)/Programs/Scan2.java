import java.util.Scanner;
class Scan2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Wnter your first name :");
		String firstName = sc.nextLine();
		
		System.out.println("Enter your last name :");
		String lastName = sc.nextLine();
		
		System.out.println("your full name is"+ firstName + " " + lastName);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your location : ");
		String location = sc.nextLine();
		
		System.out.println("Enter your salary");
		double sal = sc.nextDouble();
		
	}
}
