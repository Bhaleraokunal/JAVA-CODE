import java.util.Scanner;
class Hotel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("-----------------WELCOME SIR TO TAZAA HOTEL --------------------");
		System.out.println("-------------- 1. VEG MENU---------------------");
		System.out.println("--------------2. NON-VEG MENU---------------------");
		System.out.println("Choose from the above options :");
		
		int ip = sc.nextInt();
		
		switch (ip)
		{
			case 1 :
			{
				System.out.println("--------------------------------VEG MENU--------------------------");
				System.out.println("1. POHA         ------------------------------>    20.0");
				System.out.println("2. SABUDANA     ------------------------------>    30.0");
				System.out.println("3. WADA         ------------------------------>    30.0");
				System.out.println("4. SAMOSA       ------------------------------>    20.0");
				System.out.println("5. IDLI         ------------------------------>    40.0");
				System.out.println("6. DOSA         ------------------------------>    20.0");
				System.out.println("7. MISAL PAV    ------------------------------>    20.0");
				
				System.out.println("Select from the above options:");
				int num = sc.nextInt();
				switch (num)
				{
				case 1:
				case 4:
				case 6:
				case 7:
					{
						
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*20;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
				case 2:
				case 3:
					{
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*20;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
				case 5 :
					{
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*20;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
				default :
					{
						System.out.println("Education is Free !");
					}
				}
				
			}
			case 2 :
			{
				System.out.println("--------------------------------VEG MENU--------------------------");
				System.out.println("1. CHIKEN BIRYANI  --------------------------->    200.0");
				System.out.println("2. CHIKEN CURRY    --------------------------->    100.0");
				System.out.println("3. BREAD OMLETTE   --------------------------->    40.0");
				System.out.println("4. MUTTON KHEMA    --------------------------->    200.0");
				System.out.println("5. FISH FRY        --------------------------->    100.0");
				System.out.println("6. OMLETTE ROLE    --------------------------->    60.0");
				System.out.println("7. MUGALI CHIKEN   --------------------------->    200.0");
				
				System.out.println("Select from the above options:");
				int num = sc.nextInt();
				
				switch (num)
				{
					case 1 :
					case 4 :
					case 7 :
					{
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*200;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
				case 2 :
					{
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*100;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
				case 3 :
					{
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*40;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
				case 5 :
					{
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*100;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
				case 6 :
					{
						System.out.println("How many plates you wants : ");
						int plates = sc.nextInt();
						
						double bill = plates*600;
						System.out.println("Your bill amount is : " + bill);
						break;
					}
					default :
					{
						System.out.println("Education is Free !");
					}
				}
			} break;
			default :
					{
						System.out.println("Education is Free !");
					}	
		}
	}
}
