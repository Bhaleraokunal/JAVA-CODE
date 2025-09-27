import java.util.Scanner ;
class UglyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		System.out.println("Enter your second number :");
		int end = sc.nextInt();
		
		while (num<end)
		{
			int temp = num;
			while (temp>1)
		{
			if (temp%2==0)
			{
				temp/=2;
			}
			else if (temp%3==0)
			{
				tem/=3;
			}
			else if (num%5==0)
			{
				num/=5;
			}
			else
			{
				break;
				
			}
			
		}
		if (num==1)
		{
			System.out.println(num);
		}
		else
		{
			
		}
		temp++;
		}
	}
}
