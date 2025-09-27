import java.util.Scanner ;
class StrongNmber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int temp=num;
		int sum = 0 ; 
		while (num>0)
		{
			int rem = num%10;
			int fact=1;
			while (rem>0)
			{
				fact*=rem;
				rem--;
			}
			sum+=fact;
			num/=10;
		}
		if (temp==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a strong number");
		}
	}
}
