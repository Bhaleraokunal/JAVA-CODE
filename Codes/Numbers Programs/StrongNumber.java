import java.util.Scanner ;
class StrongNumber 
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
			int temp =num ; 
			
			while (temp!=0)
			{
				int fact = 1;
				int digit = temp%10;
				
				for (;digit>0 ;digit-- )
				{
					fact=fact*digit;
				}
				sum= sum+fact;
				temp/=10;
			}
			if (sum==num)
			{
				System.out.println(num);
			}
			num++;	
		}
	}
}
