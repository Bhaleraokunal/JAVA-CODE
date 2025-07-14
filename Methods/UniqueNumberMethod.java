import java.util.Scanner ;
class UniqueNumberMethod 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		if (isUnique(n))
		{
			System.out.println("It is a unique number:");
		}
		else
			System.out.println("It is not a unique number :");
	}
	
	public static boolean isUnique(int n)
	{
		int max = -1;
		int min = 10;
		
		for (int i=n;i>0 ;i/=10)
		{
			int rem = i%10;
			
			min = min<rem?min:rem;
			max = max>rem?max:rem;
		}
		
		for (int i=min;i<=max ;i++ )
		{
			int ct = 0 ;
			int num = n;
			
			while (num>0)
			{
				int rem = num%10;
				
				if (i==rem)
				{
					ct++;
				}
				num/=10;
			}
			if (ct>1)
			{
				return false;
			
			}
			
		}
		return true;
	}
}
