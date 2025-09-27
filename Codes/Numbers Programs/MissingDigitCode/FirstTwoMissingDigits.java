import java.util.Scanner ;
class FirstTwoMissingDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		int max = -1;
		int min = 10;
		
		int ct = 0;
		for (int i=n;i>0 ;i/=10 )
		{
			int last = i%10;
			max=max>last?max:last;
			min=min<last?min:last;
		}
		
		for (int i=min;i<=max ;i++ )
		{
			int res = n;
			boolean flag = false;
			
			while (res>0)
			{
				int digit = res%10;
				
				if (i==digit)
				{
					flag = true;
					break;
				}
				res/=10;
			}
			
			if (flag==false)
			{
				ct++;
				if (ct<=2)
				{
					System.out.println(i);
				}
			}
		}
	}
}
