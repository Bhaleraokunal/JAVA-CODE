import java.util.Scanner ;
class FisrtDigitiIsEvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int firstDigit = num ;
		while (firstDigit>=10)
		{
			num/=10;
		}
		if (firstDigit%2==0)
		{
			System.out.println("The first number is even ");
		}
		else
		{
			System.out.println("The fist number is odd");
		}
	}
}
