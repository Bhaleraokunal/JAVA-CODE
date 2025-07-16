import java.util.Scanner ;
class RecCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("This code only accept the positive value ");
		System.out.println("Enter your number that you want to count of :");
		int num = sc.nextInt();
		
		
		if (num==0)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(count(num, 0));
		}
	}
	
	
	public static int count(int num , int ct)
	{
		return num==0?ct:count(num/10, ct+1);
	}
}
