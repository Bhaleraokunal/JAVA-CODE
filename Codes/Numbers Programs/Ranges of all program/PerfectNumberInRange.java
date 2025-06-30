import java.util.Scanner ;
class PerfectNumberInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your ending number :");
		int end = sc.nextInt();
		
		while (num<=end)
		{
			int sum = 0 ;
			
			for (int i=1;i<=num/2 ;i++ )
			{
				if (num%i==0)
				{
					sum+=i;
				}
			}
			if (sum==num)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
