import java.util.Scanner ;
class ChekThePalindromeNumberIsPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		int rev = 0;
		int temp=num;
		while (temp>0)
		{
			rev= rev*10+temp%10;
			temp/=10;
		}
		if (num == rev)
		{
			int dm=2;
				for (;dm<num ;dm++ )
				{
					if (num%dm==0)
					{
						break;
					}
				}
				if (num==dm)
				{
					System.out.println("It is a palindromic prime number");
				}
				else
			{
				System.out.println("It is a palindrome but not a prime number");
			}
		}
		else
		{
			System.out.println("it is not a palindromic number");
		}
	}
}
