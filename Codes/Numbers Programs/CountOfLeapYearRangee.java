class CountOfLeapYearRangee 
{
	public static void main(String[] args) 
	{
		int startYear = 2000;
		int endYear = 3000;
		int count = 0;
		while (startYear <= endYear)
		{
			if (startYear%4==0 && startYear%100!=0 || startYear%400==0)
			{
				count++;
			}
			startYear++;
		}
		
				System.out.println("There are " + count + " leap years from  2000 to " + endYear + " in the given range.");

	}
}
