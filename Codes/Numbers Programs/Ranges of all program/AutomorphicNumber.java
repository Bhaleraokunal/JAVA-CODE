import java.util.Scanner ;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your endint number :");
		int end = sc.nextInt();
		
		while (num<=end)
		{
			int sq = num*num;
			int ct = (int)Math.log10(sq)+1;
				
			int divisor= 1;
			for (int i=1;i<ct ;i++ )
			{
				divisor*=10;
			}
			
			if (num==(sq%divisor))
			{
				System.out.println(num);
			}
		}
	}
}
