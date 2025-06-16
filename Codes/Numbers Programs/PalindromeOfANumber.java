import java.util.Scanner ;
class PalindromeOfANumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener your number :");
		int num = sc.nextInt();
		int rev = 0 ;
		int temp = num ;
		while (temp!=0)
		{
			rev = rev*10+(temp%10);
			temp/=10;
		}
		System.out.println(rev);	
		if (rev==num)
		{
			System.out.println("It is palindrome number ");
		}
		else
		{
			System.out.println("it is not a palindrome number");
		}
	}
}
