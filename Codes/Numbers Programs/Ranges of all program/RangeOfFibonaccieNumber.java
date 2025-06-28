import java.util.Scanner ;
class RangeOfFibonaccieNumber
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int start = sc.nextInt();
		
		System.out.println("Enter your ending number");
		int end = sc.nextInt();
		
		int n1=0;
		int n2=1;
		int res;
		
		while (n1<=end)
		{
			res=n1+n2;
			if (n1>=start)
			{
				System.out.println(n1);
			}
			n1=n2;
			n2=res;
		}
	}
}