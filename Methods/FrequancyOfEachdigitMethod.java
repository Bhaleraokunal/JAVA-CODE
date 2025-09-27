import java.util.Scanner ;
class FrequancyOfEachdigitMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		frequancyOfNumber(n);
	}
	
	public static void frequancyOfNumber(int n )
	{
		int max =-1;
		int min = 10;
		
		
		for (int i=n;i>0 ;i/=10 )
		{
			int rem = i%10;
			
			min = min<rem?min:rem;
			max = max>rem?max:rem;
		}
		
		for (int i=min;i<=max ;i++ )
		{
			int count = 0 ;
			int num = n ; 
			
			while (num>0)
			{
				int rem = num%10;
				
				if (rem==i)
				{
					count++;
				}
				num/=10;
			}
			
			if (count >0)
			{
				System.out.println("The frequancy of a "+i+" is "+count);
			}
		}
	}
}

