import java.util.Scanner ;
class AllMisingDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		allMisingDigit(n);
	}
	
	public static void allMisingDigit(int n )
	{
		
		for (int i=0;i<=9 ;i++ )
		{
			int count = 0 ;
			int num = n ; 
			
			while (num>0)
			{
				int rem = num%10;
				
				if (rem==i)
				{
					count++;
				}
				num/=10;
			}
			
			if (count==0)
			{
				System.out.println("The missing digits are "+i);
			}
		}
	}
}

