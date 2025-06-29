import java.util.Scanner ;
class  NenoNumberInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		System.out.println("Enter your ending number:");
		int end = sc.nextInt();
		
		while(num<=end)
		{
			int sum = 0;
			int square = num*num;
			while (square>0)
				{
					sum+=square%10;
					square/=10;
				}
				if (num==sum)
					{
						System.out.println(num);
					}
			num++;
		}
	}
}
