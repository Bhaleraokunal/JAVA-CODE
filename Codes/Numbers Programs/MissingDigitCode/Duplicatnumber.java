import java.util.Scanner ;
class Duplicatnumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max=-1;
		int min=10;
		boolean duplicateFound = false;
		for (int i=n;i>0 ;i/=10 )
		{
			int last = i%10;
			max=max>last?max:last;
			min=min<last?min:last;
		}
		
		for (int i=min;i<=max ;i++ )
		{
			int ct = 0;
			int n1=n;
			while (n1>0)
			{
				int digit = n1%10;
				if (i==digit)
				{
					ct++;
				}
				n1/=10;
			}
			if (ct>=2)
			{
				System.out.println("The digit " + i + " is duplicate");
				duplicateFound= true;
			}
		}
		if (!duplicateFound)
		{
			System.out.println("No duplicate digits found.");
		}
	}
}
