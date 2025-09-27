import java.util.Scanner ;
class  LastMissingDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=-1;
		int min=10;
		
		for (int i=n;i>0 ;i/=10 )
		{
			int digit = i%10;
			 max= max>digit?max:digit;
			 min=min<digit?min:digit;
		}
		
		int lastDigit = 0 ;
		for (int i=min;i<=max ;i++ )
		{
			int res=n ;
			boolean flag=false;
			
			while (res>0)
			{
				int last=res%10;
				
				if (i==last)
				{
					flag=true;
					break;
				}
				res/=10;
			}
			
			if (!flag)
			{
				lastDigit=i;
				
			}
		}
		
		System.out.println("The last missing digit is "+lastDigit);
	}
}
