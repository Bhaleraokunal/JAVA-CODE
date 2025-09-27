import java.util.Scanner ;
class SunnyNumberMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		if (isSunny(n))
		{
			System.out.println("It is a sunny number ");
		}
		else
			System.out.println("It is not a sunny number ");
	}
	
	public static boolean isSunny(int n )
	{
		n+=1;
		
		for (int i=1;i<=n ;i++ )
		{
			if (i*i==n)
			{
				return true;
			}
		}
		return false;
	}
}
