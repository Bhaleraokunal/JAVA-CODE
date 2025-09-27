import java.util.Scanner ;
class DecimalToBinaryMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		String bin = binary(n);
		
		System.out.println("The binary vaule of "+ n+" is "+ bin);
	}
	
	public static String binary(int n)
	{
		String bin = " ";
		while (n>0)
		{
			int rem = n%2;
			bin= rem+bin;
			n/=2;
		}
		return bin;
	}
}
