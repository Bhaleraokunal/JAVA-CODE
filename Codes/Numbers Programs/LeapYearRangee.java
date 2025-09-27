class LeapYearRangee 
{
	public static void main(String[] args) 
	{
		int startYear = 2000;
		int endYear = 3000;
		
		while (startYear <= endYear)
		{
			if (startYear%4==0 && startYear%100!=0 || startYear%400==0)
			{
				System.out.println(startYear);
			}
			startYear++;
		}
	}
}
