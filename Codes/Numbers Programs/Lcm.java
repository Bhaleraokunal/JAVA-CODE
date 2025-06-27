class Lcm
{
	public static void main (String[] args)
	{
		int n1=9;
		int n2=6;
		int i =1;
		int l =n1>n2?n1:n2;
		
		while (true)
		{
			if ((l*i)%n2==0 && (l*i)%n1==0 )
			{
				System.out.println("The lcm of the given number is :"+l*i);
				break;
			}
			i++;
		}
		}
}
