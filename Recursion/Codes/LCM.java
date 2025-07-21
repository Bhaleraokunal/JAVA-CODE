import java.util.Scanner ;
class LCM		 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number 1 :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter your number 2 :");
		int n2 = sc.nextInt();
		
		int n3 = 0;
		
		System.out.println(lcm(n1,n2,n3=n1>n2?n1:n2));
	}
	
	public static int lcm( int n1, int n2, int large)
	{
		if (large%n1==0 && large%n2==0)
		{
			return large;
		}
		return lcm(n1,n2,large+1);
	}
}
