class PalindromeMethod 
{
	public static void main(String[] args) 
	{
		if (palin(121))
		{
			System.out.println("Palindrome number ");
		}
	}
	
	public static boolean palin(int a )
	{
		int rev = 0;
		for (int i=a;i>0 ;i/=10 )
		{
			rev=rev*10+(i%10);
		}
			return a==rev;
	}
}
