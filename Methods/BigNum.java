class BigNum 
{
	public static void main(String[] args) 
	{
		int num = 192 ;
		int mul =0;
		String  to = "";		
		for (int i=1;i<=3 ;i++ )
		{
			mul=num*i;
			to+=mul;
			
		}
		
		System.out.println(to);
	}
}
