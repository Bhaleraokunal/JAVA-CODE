import java.util.Scanner ;
class HarshadNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		System.out.println("Enter ending number your number :");
		int end = sc.nextInt();
		
		for (;num<=end ;num++ )
		{
			int sum = 0;
			int temp = num ;
		
		while (temp!=0)
		{
			int rem = temp%10;
			sum+=rem;
			temp/=10;
		}
			if (num%sum==0)
			{
				System.out.println(num);
			}
		
		}
	}
}
