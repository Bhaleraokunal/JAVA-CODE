import java.util.Scanner ;
class  UniqueNumber
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean flag = false;
		
		for (int i=1;i<=9 ;i++ )
		{
			
			int count = 0;
			int n1 = n;
			
			while (n1>0)
			{
				int last = n1%10;
				if (last == i)
				{
					count ++;
					
				}
				n1/=10;
			}
			if (count>=2)
			{
				flag=true;
				break;
			}
		}
		
		if (flag)
		{
			System.out.println("It is not unique number ");
		}
			else
				System.out.println("It is unique number ");
	}
}