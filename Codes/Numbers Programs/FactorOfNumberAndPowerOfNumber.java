class FactorOfNumberAndPowerOfNumber 
{
	public static void main(String[] args) 
	{
		int num  = 4;
		int factorCount = 0;
		
		for (int dm = 1;dm<=num ;dm++ )
		{
			if (num%dm==0)
			{
				factorCount++;
			}
		}
		
		int power = 1;
		int raise = factorCount;
		while (raise>0)
		{
			power*=num;
			raise--;
		}
		
		System.out.println("The count of a factor is :"+ factorCount);
		System.out.println("The power of a number is :"+ power);
	}
}
