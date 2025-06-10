class Sum 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int sum = 0;
		int num = 4;
		System.out.println("the value of start is " +start);
		while (start <= num)
		{
			sum+=start;
			start++;
			
			System.out.println("the valuse of start is "+start);
			System.out.println(" the value of sum is "+sum);
		}
		System.out.println("The value of sum is: " + sum);
		System.out.println("The value of num is: " + num);
		System.out.println("The value of start is: " + start);
	}
}
