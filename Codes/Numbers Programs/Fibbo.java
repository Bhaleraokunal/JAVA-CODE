import java.util.Scanner ;
class Fibbo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your number:");
		int end = sc.nextInt();
		
		int n1=0, n2=1, res;
		
		
		while (num<=end)
		{
			res=n1+n2;
			
			if (res>=num)
			{
				System.out.println(n1);
			}
			n1=n2;
			n2=res;
			
			num++;
		}
	}
}
