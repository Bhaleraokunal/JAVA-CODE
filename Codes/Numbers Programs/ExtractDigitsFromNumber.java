class ExtractDigitsFromNumber 
{
	public static void main(String[] args) 
	{
		long num = 123434123143132l;
		long last;
		int count = 0;
		
		while (num>0)
		{
			last = num%10;
			
			System.out.println(last);
			
			num=num/10;
			count++;
		}
		
		
		System.out.println("The count of the digits is :" + count);
	}
}
