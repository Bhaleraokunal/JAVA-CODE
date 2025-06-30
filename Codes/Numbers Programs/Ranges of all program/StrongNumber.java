import java.util.Scanner ;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your ending number:");
		int end = sc.nextInt();
		
		while (num<=end)
		{
			int sum = 0;
			
			for (int i=num;i>0 ;i/=10 )
			{
				int fact = 1;
				int digit = i%10;
				
				while (digit>0)
				{
					fact = fact*digit;
					digit--;
				}
				sum = sum + fact;
			}
			
			if (num==sum)
			{
				System.out.println(num);
			}
			
			num++;
		}
	}
}
