import java.util.Scanner ;
class RangeInArmstrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		System.out.println("Enter you second number:");
		int end =sc.nextInt();
		
		
		
		while (num<=end)
		{
			int temp =num;
			int count =0 ;
			int sum =0 ;
			while (temp!=0)
			{
				count++;
				temp/=10;
			}
			int temp1= num;
			while (temp1!=0)
			{
				int power = 1;
				int rem = temp1%10;
				for (int i=0;i<count ;i++ )
				{
					power*=rem;
				}
				sum+=power;
				temp1/=10;
			}
			if (sum==num)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
