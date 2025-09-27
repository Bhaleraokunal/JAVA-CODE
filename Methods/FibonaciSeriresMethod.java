import java.util.Scanner ;
class FibonaciSeriresMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		fibbonacciNumber(num);
	}
	
	public static void fibbonacciNumber(int n)
	{
		int n1=0, n2=1, res;
		
		while (n1<=n)
		{
			res=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=res;
		}
	}
}
