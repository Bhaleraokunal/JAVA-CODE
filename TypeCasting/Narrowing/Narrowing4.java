class  Narrowing4
{
	public static void main(String[] args) 
	{
		int i = 100006;
		char ch = (char) i;
		short s = (short) i;
		byte b = (byte) i;
		

		System.out.println(i);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(b);
		
	}
}
