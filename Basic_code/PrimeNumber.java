import java.util.*;
class  PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter your number : ");
		int Number = sc.nextInt();
		int count = 0;
			for (int i =1 ; i*i<=Number; i++ )
			{
			if (Number % i == 0)
		     	{
				       count = count + 1;
					if (Number/i != i )
					{
						 count = count + 1;
					}
		    	}
				if (count > 2)
			{
				break;
			}
			}	
			
			if (count == 2)
			{
				System.out.println("This is the Prime Number");
			}
			else
		{
				System.out.println ("this is not a prime number");
		}
	}
}
