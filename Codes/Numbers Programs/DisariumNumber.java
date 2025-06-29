import java.util.Scanner ;
class DisariumNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		System.out.println("Enter your ending number:");
		int end = sc.nextInt();
		
		while (num<=end)
		{
			
			int sum = 0;
			int ct = (int)Math.log10(num)+1;
			
			for (int temp=num;temp>0 ;temp/=10 )
			{
				int digit=temp%10;
				int pow=1;
				for (int i=0;i<ct ;i++ )
				{
					pow*=digit;
				}
				sum+=pow;
				ct--;
			}
			if (num==sum)
				{
					System.out.println(num);
				}
		
				num++;
		}
	}
}
