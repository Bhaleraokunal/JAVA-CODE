class CoundOfEvenOdd 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 99;
		int count1= 0;
		int count2= 0;
		
		while (start <= end)
		{
			if (start%2==0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
			start++;
		}
		
		System.out.println("The even number count is " + count1);
		System.out.println("The odd number count is " + count2);
		
	}
}
