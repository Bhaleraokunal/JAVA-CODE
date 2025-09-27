import java.util.Scanner ;
class Xylem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		System.out.println("Enter your ending number:");
		int end = sc.nextInt();
		
		while (num<=end)
		{
			int temp=num;
			int sumOfEnd=temp%10;
				temp/=10;
			int sumOfMid =0;
			
			while (temp>9)
			{
				sumOfMid+=temp%10;
				temp/=10;
			}
			sumOfEnd+=temp;
			
			if (sumOfMid==sumOfEnd)
			{
				System.out.println(num);
			}
			num++;
		}
	}
}
