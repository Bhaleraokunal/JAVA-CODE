class DoWhileSumOfDigitAndProd 
{
	public static void main(String[] args) 
	{
		int num = 12312;
		int sum = 0, prod = 1;
		
		do
		{
			int last = num % 10 ;
			sum+=last;
			prod*=last;
			
			num/=10;
		}
		while (num!=0);
		
		System.out.println("The sum of the number is :"+sum);
		System.out.println("The prod of the number is :"+ prod);
	}
}
