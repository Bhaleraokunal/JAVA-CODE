import java.util.Scanner ;
class CalculatorDrive

{
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		
		System.out.println("Did you create a account : Y/N");
		char y =sc.next().charAt(0) ; 
		sc.nextLine();
		
		while(true)
		{
			
		if (yesNo(y))
		{
			System.out.println("Enter your username :");
			String userName = sc.nextLine();
			
			System.out.println("Enter your password :");
			int password = sc.nextInt() ;
			
			if (userName == c1.userName && password == c1.password)
			{
				System.out.println("You are logged in sucessfully!");
				
				System.out.println("-----------------------WLECOME------------------");
				System.out.println("--------------------CHOOSE THE OPTIONS----------");
				System.out.println("1. Addition");
				System.out.println("2. Subtraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Divison");
				System.out.println("5. Modulas");
				System.out.println("6. Exit");
				
				int op = sc.nextInt();
				
				switch (op)
				{
				case 1:
					{
						System.out.println("Enter your first value :");
						int a = sc.nextInt();
						
						System.out.println("ENter your seond value :");
						int b = sc.nextInt();
						
						c1.addition(a,b);
						break;
					}
				case 2:
					{
						System.out.println("Enter your first value :");
						int a = sc.nextInt();
						
						System.out.println("ENter your seond value :");
						int b = sc.nextInt();
						
						c1.subtraction(a,b);
						break;
					}
				case 3:
					{
						System.out.println("Enter your first value :");
						int a = sc.nextInt();
						
						System.out.println("ENter your seond value :");
						int b = sc.nextInt();
						
						c1.multiplication(a,b);
						break;
					}
				case 4:
					{
						System.out.println("Enter your first value :");
						int a = sc.nextInt();
						
						System.out.println("ENter your seond value :");
						int b = sc.nextInt();
						
						c1.divison(a,b);
						break;
					}
				case 5:
					{
						System.out.println("Enter your first value :");
						int a = sc.nextInt();
						
						System.out.println("ENter your seond value :");
						int b = sc.nextInt();
						
						c1.mod(a,b);
						break;
					}
				case 6:
					{
						return;
					}
				}
			}
			else
			{
				
				System.out.println("Invalid credintial!");
				break;
			}
		}
		else
		{
			
			System.out.println("Create your Account :");
			System.out.println("Create your username :");
			c1.userName =  sc.nextLine();
			
			System.out.println("Create your password :");
			c1.password = sc.nextInt();
			
			System.out.println("Congratulation your account created sucessfully!");
			
		}
		
		
	}
	
	}
	public static boolean yesNo(char yes)
	{
		if (yes=='Y' || yes == 'y')
		{
			return true;
		}
		else if (yes == 'N' || yes == 'n')
		{
			return false ;
		}
		
		return false;
	}
}
