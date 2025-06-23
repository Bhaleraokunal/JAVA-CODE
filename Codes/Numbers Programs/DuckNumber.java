import java.util.Scanner ;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		/*System.out.println("Enter your number");
		int numbe = sc.nextInt();
		*/
		
		
		System.out.println(number);
		for (;number!=0; number/=10)
		{
			if (number%10==0)
			{
				System.out.println("It is a duck number");
				break;
			}
			
			
		}
		if (number==0)
		{
			System.out.println("It is not a duck number");
		
		}
		
	}
}
