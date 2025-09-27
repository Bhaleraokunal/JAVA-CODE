import java.util.Scanner ;
class RecCount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		System.out.println(count(num,0));
	}
	
	public static int count(int num, int count)
	{
		if (num==0)
		{
			return count;
		}
		return count(num/10,count+1);
	}
}
