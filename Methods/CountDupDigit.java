import java.util.Scanner ;
class CountDupDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		System.out.println("The dupplicat digit count is " + countDup(num));
	}
	
	public static int countDup(int n)
	{
		int ct =0;;

		
		for (int i=0;i<=9 ;i++ )
		{
			int count=0;
			int num = n;
			while (num>0)
			{
				int rem = num%10;
				if (rem==i)
				{
					count++;
				}
				num/=10;
			}
			if (count>1)
			{
				ct++;
			}
		}
		return ct;
	}
	
}
