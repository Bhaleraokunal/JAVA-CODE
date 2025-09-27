import java.util.Scanner ;
class SpyNumberInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your ending number :");
		int end = sc.nextInt();
		
		do
		{
			int sum = 0;
			int prod = 1;
			
			for (int i=num ;i>0 ;i/=10 )
			{
				sum+=(i%10);
				prod*=(i%10);
			}
			
			if (sum == prod)
			{
				System.out.println(num);
			}
			num++;
		}
		while (num<=end);
	}
}
