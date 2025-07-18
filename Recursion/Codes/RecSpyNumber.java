import java.util.Scanner ;
class  RecSpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		if (isSpy(num,0,1))
		{
			System.out.println("It is spy number :");
		}
		else
			System.out.println("It is not a spy number ");
	}
	
	
	public static boolean isSpy(int num, int sum, int prod)
	{
		if (num==0)
		{
			return sum==prod;
		}
		return isSpy(num/10, sum+num%10, prod*num%10);
	}
}
