import java.util.Scanner;
class SearchDigitMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		System.out.println("Enter the number that you want to find :");
		int n1 = sc.nextInt();
		
		if (searchDigit(n,n1))
		{
			System.out.println("The digit is found "+ n1);
		}
		else
			System.out.println("The digit is not there ");
	}
	
	public static boolean searchDigit(int num, int search)
	{
		while (num>0)
		{
			int rem = num%10;
			
			if (rem==search)
			{
				return true;
			}
			num/=10;
		}
		return false;
	}
}
