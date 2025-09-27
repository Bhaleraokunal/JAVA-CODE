import java.util.Scanner ;
class Missing 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1;
		int min = 10;
		boolean flag = false ;
		for (int i=n;i>0 ;i/=10 )
		{
			int last = i%10;
			min = min<last?min:last;
			max = max>last?max:last;
		}
		
		for (int i=min;i<=max ;i++ )
		{
			int ans = n;
			int ct = 0 ;
			while (ans>0)
			{
				int digit = ans%10;
				
				if (i == digit)
				{
					ct++;
				}
				ans/=10;
			}
			if (ct>=2)
			{
				System.out.println("The "+i+" is "+ct+" time present " );
			}
		}
	}
}
