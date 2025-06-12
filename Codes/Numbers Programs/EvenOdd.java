import java.util.Scanner ;
class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter you number :");
		int num = sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println("This number is even number :"+ num);
		}
		else
		{
			System.out.println("This number is odd number :"+ num);
		}
	}
	
}