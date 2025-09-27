import java.util.Scanner ;
class PalindromeInRange 
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
			int rev=0;
			
			for (int i=num;i>0 ;i/=10 )
			{
				rev=rev*10+(i%10);
			}
			
			if (rev==num)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
