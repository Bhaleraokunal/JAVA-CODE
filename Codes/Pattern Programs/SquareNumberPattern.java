import java.util.Scanner ;
class  SquareNumberPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int diff =1;
		for (int i=1;i<=n ;i++ )
		{
			diff=i;
			
			for (int j=0;j<n ;j++,diff+=4 )
			{
				
				System.out.print(diff+"  ");
			}
			System.out.println();
		}
	}
}
