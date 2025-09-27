class SumOfEvenOddOfProduct 
{
	public static void main(String[] args) 
	{
		int start = 1 ;
		int end = 1000;
		int sum = 0 ;
		int prod = 1 ;
		
		while (start <=end)
		{
			if (start%2==0)
			{
				sum+=start;
			}
			else
			{
				prod*=start;
			}
				start++;
		}
		System.out.println("The sum of the even number is : "+sum);
		System.out.println("The prod of the odd number is : "+prod);
	}
}
