import java.util.Scanner ;
class CountOfDidgit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		String string =  num+"";
		
		System.out.println(string);
		
		int count = string.length();
		
		System.out.println(count);
	}
}
