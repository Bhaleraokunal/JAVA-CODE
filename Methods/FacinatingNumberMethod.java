import java.util.Scanner ;
class FacinatingNumberMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		
		if (faciNumber(num))
		{
			System.out.println("It is fascinating number :");
		}
		else
			System.out.println("It is not a fascintaing number :");
	}
	
	
	public static boolean faciNumber(int n)
	{
		String total="";
		int mul=0;
		for (int i=1;i<=3 ;i++ )
		{
			mul=n*i;
			total+=mul;
		}
		
		long value = Long.parseLong(total);
		int count = (int)Math.log10(value)+1;
		
		if (count==9)
		{
			for (int i=1;i<=9 ;i++ )
			{	
				long num = value;
				int ct = 0 ;
				while (num>0)
				{
					int rem = (int)num%10;
					
					if (rem==0)
					{
						return false;
					}
					
					if (i==rem)
					{
						ct++;
					}
					num/=10;
				}
				if (ct!=1)
				{
					return false;
					
				}
			}
			return true;
		}
		return false;
	}
}
