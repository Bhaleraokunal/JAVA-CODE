class RecOfPrime 
{
	public static void main(String[] args) 
	{
		System.out.println(isPrime(7,2));
	}
	
	public static boolean isPrime(int num , int den )
	{
		 if (num%den==0)
		{
			return false ;
		}
		
		else if (num==den)
		{
			return true;
		}
		
		
		return isPrime(num,den+1);
	}
}
