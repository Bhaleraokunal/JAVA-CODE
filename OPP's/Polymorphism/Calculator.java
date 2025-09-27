package polymorphism;

public class Calculator {

	public void digtiCount(int num)
	{
		int ct = 0 ;
		for(int i=num; i>0; i/=10)
		{
			ct++ ;
		}
		
		System.out.println("The total count is :"+ ct);
	}
	
	public boolean isPrime(int num)
	{
		int den = 2;
		
		while(den <=num )
		{
			if (num%den==0) {
				break ;
			}
		}
		return den == num ;
	}
	
	
	public void factor(int num)
	{
		for (int i=1; i<=num; i++ )
		{
			if (num%i==0) {
				
				System.out.println(i);
			}
		}
	}
	
	
}
