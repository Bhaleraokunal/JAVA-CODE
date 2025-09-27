import java.util.Scanner ;
class TechNumberInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your staring number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your ending number :");
		int end = sc.nextInt();
		
		while (num<=end)
		{
			int ct = (int)Math.log10(num)+1;
			int sq = 0;
			if (ct%2==0)
			{
				int temp = num ;
				int divisor=1;
				for (int i=0;i<ct/2 ;i++ )
				{
					divisor*=10;
				}
				int firstHalf=temp%divisor;
					temp/=divisor;
				int secondHalf=temp;
				int sum = firstHalf+secondHalf;
				sq= sum*sum;
				
				if (sq==num)
				{
					System.out.println(num);
				}
			}
			num++;
		}
	}
}
