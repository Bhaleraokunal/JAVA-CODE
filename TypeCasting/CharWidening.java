class CharWidening 
{
	public static void main(String[] args) 
	{
		char c = 'a' ; 
		////short s = c;
		int i = c ;
		long l = c ;
		float f = c ;
		double d = c;
		
		System.out.println(c);
		//System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}
