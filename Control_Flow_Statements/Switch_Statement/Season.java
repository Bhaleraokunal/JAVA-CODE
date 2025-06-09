import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------welcome----------------------------");
		System.out.println("Choose the Months from below List :");
		System.out.println("a. January");
		System.out.println("b. February");
		System.out.println("c. March");
		System.out.println("d. April");
		System.out.println("e. May");
		System.out.println("f. June");
		System.out.println("g. July");
		System.out.println("h. August");
		System.out.println("i. September");
		System.out.println("j. October");
		System.out.println("k. November");
		System.out.println("l. December");
		
		char ch = sc.next().charAt(0);
		
		switch (ch)
		{
		case 'l' :
		case 'a' :
		case 'b' :
			{
				System.out.println("Winter");
				break;
			}
		case 'c' :
		case 'd' :
		case 'e' :
			{
				System.out.println("Summer");
				break;
			}
		case 'f':
		case 'g':
		case 'h':
			{
				System.out.println("Rainy");
				break;
			}
		case 'i':
		case 'j':
		case 'k':
			{
				System.out.println("Autumn");
				break;
			}	
			
		default :
			{
				System.out.println("Education if Free take addmission !");
				
			}
			
		
		}
	}
}
