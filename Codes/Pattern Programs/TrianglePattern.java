import java.util.Scanner ;
class TrianglePattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = n - 1; i >= 0; i--)
		{
			for (int spa=0;spa<n-i-1;spa++ )
			{
				System.out.print(" "+" ");
			}
			
			for (int sta=0;sta<=2*i ;sta++ )
			{
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
}
