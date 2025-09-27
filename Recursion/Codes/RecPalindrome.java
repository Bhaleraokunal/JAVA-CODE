import java.util.Scanner ;
class RecPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		if (isPalindrome(num,num,0))
		{
			System.out.println("The given number "+num + " is "+ "palindrome");
		}
		else
			System.out.println("The given number "+num + " is not "+ "palindrome");
	}
	
	public static boolean isPalindrome(int num, int temp, int rev)
	{
		if (num==0)
		{
			return rev==temp;
		}
		return isPalindrome(num/10,temp,rev*10+num%10);
	}
}
