import java.util.Scanner;
class TimeTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------welcome----------------");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thrusday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		
		int ip = sc.nextInt();
		
		switch (ip)
		{
		case 1 :
			{
				System.out.println("Science");
				break;
			}
		case 2 :
			{
				System.out.println("Math");
				break;
			}
		case 3 :
			{
				System.out.println("Social Science");
				break;
			}
		case 4 :
			{
				System.out.println("English");
				break;
			}
		case 5 :
			{
				System.out.println("Marathi");
				break;
			}
		case 6 :
			{
				System.out.println("Histroy");
				break;
			}
		case 7 :
			{
				System.out.println("Just chill !");
				break;
			}
			
		default :
			{
				System.out.println("Education is free !");
			}
		}
		
	}
}
