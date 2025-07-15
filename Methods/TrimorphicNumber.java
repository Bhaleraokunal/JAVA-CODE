import java.util.Scanner ;
class	TrimorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		if (isTrimorphicNumber(n))
		{
			System.out.println("It is trimorphic number");
		}
		else
			System.out.println("It is not trimorphic number");
	}
	
	public static boolean isTrimorphicNumber(int n)
	{
		int cube =(int)Math.pow(n,3);
		int ct = (int)Math.log10(n)+1;
		int div = 10;
		for (int i=1;i<ct ;i++ )
		{
			div*=10;
		}
		
		return n==cube%div;
	}
}
