import java.util.Scanner ;
class NegativeTOPossitive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		num = num<0 ? -(num) : num ;
		
		System.out.println(num);
	}
}
