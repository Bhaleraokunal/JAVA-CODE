import java.util.Scanner ;
class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		System.out.println(sumOfDigit(num,0));
	}
	
	
	public static int sumOfDigit(int num, int sum)
	{
		return num==0?sum:sumOfDigit(num/10,sum+num%10);
	}
}
