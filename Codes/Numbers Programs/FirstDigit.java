import java.util.Scanner ;
class FirstDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		int fact = 1;
		 while(num>0)
		{
			fact = fact*num;
			num--;
		}
		System.out.println(fact);
	}
}
