import java.util.Scanner ;
class Patterns 
{
	public static void main(String[] args) 
	{
		hollowBox(5);
		
		hollowBoxWithX(20);
		
		hollowRightAngleTriangle (10);
		
		invertedHollowRightAngleTriangle (10);
		
		hollow1(10);
		 
		hollow2(10);
		  
		hollow3(11);
		 
		hollow4(11);
		
		hollow5(11);
		
		hollow6(11);
		
		hollow7(11);	
	}
	
	public static void hollowBox(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0 || j==0 || i==n-1 || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollowBoxWithX(int n )
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0 || j==0 || j==n-1 || i==n-1 || i==j || i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollowRightAngleTriangle(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==0 || i==j || i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void invertedHollowRightAngleTriangle(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (j==n-1 || i+j==n-1 || i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollow1(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++)
			{
				if (i==0 || j==0 || i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollow2 (int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0 || j==n-1 || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollow3 (int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0 || j==0 || i==j || i+j==n-1 || i==(n/2) || j==(n/2) || j==n-1 || i==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollow4(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==j || i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public static void hollow5(int n )
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==(n/2) || j==(n/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void hollow6(int n )
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0 || i==n-1 || i==j || i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void hollow7(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i+j==(n/2) || j-i==(n/2) || i-j==(n/2) | j+i==(n/2) || i+j==(n-1)+n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
