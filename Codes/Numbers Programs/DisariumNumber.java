import java.util.Scanner ;
class DisariumNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your ending number :");
		int end = sc.nextInt();
		
		while (num<=end)
		{
			int count  = 0 ;
		int sum = 0 ;
		
		for (int temp=num;temp!=0 ;temp/=10 )
		{
			count++;
		}
		for (int temp=num;temp!=0 ;temp/=10 )
		{
			int pow = 1;
			int rem = temp%10;
			
			for (int i=0;i<count ;i++ )
			{
				pow = pow * rem;
			}
			sum = sum+pow;
			count--;
			
		
		
		}
		if (sum==num)
		{
			System.out.println(num);
			
		}
		num++;
		}
		
	}
}
