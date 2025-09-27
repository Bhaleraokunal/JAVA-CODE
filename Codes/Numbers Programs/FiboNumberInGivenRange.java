import java.util.Scanner ; 
class FiboNumberInGivenRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int n1=0,n2=1,res;
		
		while(true)
		{
			res=n1+n2;
			if (n1==num)
			{
				System.out.println("Fibonaccie Series");
				break;
			}
			else if (n1>num)
			{
				System.out.println("Not a fibonaccie series");
				break;
			}
			n1=n2;
			n2=res;
		}
	}
}
