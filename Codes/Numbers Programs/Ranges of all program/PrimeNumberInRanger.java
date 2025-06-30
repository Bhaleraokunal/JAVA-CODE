import java.util.Scanner ;
class PrimeNumberInRanger 
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
			int den = 2;
			
			for (;den<num ;den++ )
			{
				if (num%den==0)
				{
					break;
				}
			}
			if (den==num)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
