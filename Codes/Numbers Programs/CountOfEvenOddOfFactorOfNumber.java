import java.util.Scanner ;
class CountOfEvenOddOfFactorOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number :");
		int num = sc.nextInt();
		int evenCount = 0 ;
		int oddCount = 0;
		
		for (int dm=1;dm<=num ;dm++ )
		{
			if (num%dm==0)
			{
				if (dm%2!=0)
				{
					oddCount++;
				}
				else
				{
					evenCount++;
				}
			}
		}
		System.out.println("The count of even factor of a number is :"+ evenCount);
		System.out.println("The count of odd factor of a number is :"+ oddCount);
	}
}
