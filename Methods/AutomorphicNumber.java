import java.util.Scanner ;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		if (auto (n))
		{
			System.out.println("It is a automorphic number");
		}
		else
			System.out.println("It is not a automorphic number ");
	}
	
	public static boolean auto (int a)
	{
		int count = (int)Math.log10(a)+1;
		int sq = a*a;
		int div = 10;
		
		for (int i = 0; i < count; i++) 
			{
				div *= 10;
			}
		int last = sq%div;
		
		return a==last;
	}
}
