import java.util.Scanner;
class AlternativeDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		while (num!=0)
		{
			int last = num%10;                     // Extracting the last digit.
			System.out.println(last);              // printing the last digit.
			
			num/=100;       // Removing the two digit at a time.
		}
	}
}
