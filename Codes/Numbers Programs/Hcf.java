import java.util.Scanner ; 
class HCF
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number 1 :");
		int n1 = sc.nextInt();
		
		System.out.println("Enter your number 2:");
		int n2 = sc.nextInt();
		int gcd = 0;
		
		while (n2!=0)
		{
			gcd = n1%n2;
			n1=n2;
			n2=gcd;
			
		}
		System.out.println(n1);
	}
}