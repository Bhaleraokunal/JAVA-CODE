import java.util.Scanner ;
class DiamondGridStarPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), s=n/2;
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=i;j<=s ;j++ )
			{
				System.out.print("* ");
			
			if (j<n/2)
			{
				s++;
			}
			else
			{
				s--;
			}
			}
			
			System.out.println();
		}
	}
}

/*

		* * * * * * * * *
		* *     *     * *
		*   *   *   *   *
		*     * * *     *
		* * * * * * * * *
		*     * * *     *
		*   *   *   *   *
		* *     *     * *
		* * * * * * * * *
*/
