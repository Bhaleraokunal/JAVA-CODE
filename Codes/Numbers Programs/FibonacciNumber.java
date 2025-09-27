import java.util.Scanner ;
class FibonacciNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int n1=0,n2=1,res;
		
		for (int i=0;i<num ;i++ )
		{
			res=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=res;
		}
	}
}
