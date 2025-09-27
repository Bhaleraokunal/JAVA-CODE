import java.util.Scanner ; 
class RengeOfFibonaccieNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your nth number:");
		int nth =sc.nextInt();
		int n1=0,n2=1,res;
		
		for (int i=0;i<nth ;i++ )
		{
			res=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=res;
		}
	}
}
