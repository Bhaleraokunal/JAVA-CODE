import java.util.Scanner ;
class ButterFlyPatternn
{
	public static void main(String[]a)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp=0;
		int st=n;
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<sp ;j++ )
			{
				System.out.print("* ");
			}
			for (int j=0;j<st-1 ;j++ )
			{
				System.out.print("  ");
			}
			
			for (int j=0;j<sp ;j++ )
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
			
			if (i<n/2)
			{
				sp++;
				st-=2;
			}
			else
			{
				sp--;
				st+=2;
			}
		}
	}
}