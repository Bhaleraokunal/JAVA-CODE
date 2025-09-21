package polymorphism;

public class Calculatro1 extends Calculator{
	
	public boolean isPrime(int num)
	{
		boolean falg = false ;
		
		for(int i=2; i<=num/2; i++)
		{
			if (num%i==0) {
				falg = true ;
				break ;
			}
		}
		return falg ;
	}
	
	public void factor(int num )
	{
		for(int i=1; i<=num/2; i++)
		{
			if (num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.print(num);
	}

}
