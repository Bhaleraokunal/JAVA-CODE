import java.util.Scanner ;
class SomeOfDigit2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter you Number :");
		int num = sc.nextInt();
		int sum;
		
		sum = num*(num+1)/2;
		System.out.println("The sum of a digit is "+ sum);
		
		
		
		
		
		
		/*  int num = 4;
		int sum = num*(num+1)/2;
		System.out.println("The value of sum is :" + sum);
		*/
		
	}
}
