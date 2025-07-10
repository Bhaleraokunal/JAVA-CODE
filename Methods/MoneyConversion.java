import java.util.Scanner ;
class MoneyConversion 
{
	public static void main(String[] args) 
	{
		System.out.println("Money Conversion Begin :");
		System.out.println("Enter your number to convert the Rs to USD");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		rupesToDollar(money);
	}
	
	public static void rupesToDollar(int inr)
	{
		System.out.println("INR to USD conversion starts :");
		float usd = inr/83.5f;
		System.out.println(usd+ " USD");
		
		usdToEuro(usd);
	}
	
	public static void usdToEuro(float usd)
	{
		System.out.println("USD to EUR conversion starts :");
		float eur = usd *0.92f;
		System.out.println(eur+"EUR");
		
		eurToDhirhum(eur);
	}
	
	public static void eurToDhirhum(float eur)
	{
		System.out.println("EUR to AED conversion starts :");
		float aed = eur * 3.95f;
		System.out.println(aed+" AED");
	}
}
