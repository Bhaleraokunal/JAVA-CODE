import java.util.Scanner ;
class Method2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num1 = sc.nextInt(); // USER INPUT
		
		int num = negativeToPositive(num1);
			
		if (prime(num)) // CALLING THE METHOD WITH THE HELP OF METHOD SIGNATURE. 
		{
			int rev = reverse(num); // CALLING THE THE REVSER METHOD WITH THE HELP OF METHOD SIGNATURE .
			if (num!=rev)
			{
				if (prime(rev)) // CHECKING THE REVERSE  NUMBER IS PRIME OR NOT.
				{
					System.out.println("It is a twisted prime number ");
				}
			}
		}
		else
			System.out.println("It is not a twisted prime ");
		
	}
	
	// CHECKING WHERE THE NUMBER IS PRIME OR NOT.
	
	public static boolean prime (int num )
	{
		int den = 2;
		for (;den<num ;den++ )
		{
			if (num%den==0)
			{
				break;
			}
		}
		return den==num;
	}
	
	
	//REVERSE THE NUMBER TO SATISFY THE CONDITION.
	
	public static int reverse (int num )
	{
		int rev = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			rev = rev*10+(i%10);
		}
		return rev;
	}
	
	// CONVERTING THE NEGATIVE NUMBER TO POSITIVE NUMBER.
	
	public static int negativeToPositive(int num)
	{
		int n = num<0 ? -(num): num;
		return n;
	}
}
