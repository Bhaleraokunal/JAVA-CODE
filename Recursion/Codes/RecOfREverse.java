import java.util.Scanner ; 
class RecOfREverse
{
	public static void main (String[]a)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter you number :");
		int num = sc.nextInt();
		System.out.println(reverse(num,0));
	}
	
	public static int reverse(int num , int rev)
	{
		return num==0?rev:reverse(num/10, rev*10+num%10);
	}
}