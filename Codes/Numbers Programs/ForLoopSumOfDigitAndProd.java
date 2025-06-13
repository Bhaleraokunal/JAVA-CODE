import java.util.Scanner ;
class ForLoopSumOfDigitAndProd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your number :");
		int num = sc.nextInt() ; 
		int sum = 0, prod = 1;
		int count = 0;
		for (;num!=0 ; num/=10 )
		{
			int last = num%10;
			
			sum+=last;
			
			prod*=last;
			
			count++;
		}
		System.out.println("The sum of the number is :"+ sum );
		System.out.println("The product of the number is :"+ prod);
		System.out.println("The count of the number is :"+ count);
	}
}
