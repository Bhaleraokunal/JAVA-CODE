import java.util.Scanner ;
class	 HalfDiamond
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st = 1;
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<st ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			
			if (i<n/2)
			{
				st++;
			}
			else
			{
				st--;
			}
		}
	}
}
