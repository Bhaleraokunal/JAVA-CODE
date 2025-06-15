import java.util.Scanner ;
class CountFactorOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int count = 0 ;
		
		for (int dm=1;dm<=num;dm++ )
		{
			if (num%dm==0)
			{
				count++;
			}
		}
		System.out.println("The count of an factors of number is :"+count);
	}
}
