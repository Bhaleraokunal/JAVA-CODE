import java.util.Scanner ;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int temp = num;
		
		int count=0;
		int sum =0;
		
		while (temp!=0)
		{
			count++;
			temp/=10;
		}
		
		int temp1 =num;
		while (temp1!=0)
		{
			int power =1;
			int rem = temp1%10;
			for (int i=0;i<count ;i++ )
			{
				power = power*rem;
			}
			sum+=power;
			temp1/=10;
		}
		if (num==sum)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number:");
		}
	}
}