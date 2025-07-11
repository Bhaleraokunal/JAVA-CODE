import java.util.Scanner ;
class StontioNumberMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		if (isStrontio(n))
		{
			System.out.println("It is a strontio Number");
		}
		else
		{
			System.out.println("It is not a strontio Number ");
		}
	}
	
	public static boolean isStrontio(int n)
	{
		int ct = (int)Math.log10(n)+1;
		
		if (ct==4)
		{
			n*=2;
			n/=10;
			
			int middle1 = n%10;
					n/=10;
			int middle2 = n%10;
			
			if (middle1 == middle2)
			{
				return true;
			}
		}
		return false ;
	}
}

