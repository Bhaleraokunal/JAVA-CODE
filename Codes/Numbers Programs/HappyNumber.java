import java.util.Scanner ;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int sum =0;
		
		for (int i=1;i!=sum ; )

		{
			while (num>0)
			{
				int rem = num%10;
				int square = rem*rem;
				sum+=square;
				num/=10;
			}
			if (sum==1)
			{
				break;
			}
		num=sum;
		
		
		}
		
	System.out.println(sum);
	System.out.println(num);
	}
}
