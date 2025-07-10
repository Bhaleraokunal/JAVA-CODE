import java.util.Scanner ;
class MissingDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		
		int max =-1;
		int min = 10;
		
		for (int i=num;i>0 ;i/=10 )
		{
			int last = i%10;
			min = min<last?min:last;
			max = max>max?max:last;
		}
		
		for (int i=max;i>=min ;i-- )
		{
			int res = num ;
			int ct = 0;
			while (res>0)
			{
				int digit= res%10;
				
				if (i==digit)
				{
					ct++;
				}
				res/=10;
			}
			
			if (ct>1)
			{
				System.out.println("The last missing digit is "+i);
				break;
			}
		}
		
	}
}
