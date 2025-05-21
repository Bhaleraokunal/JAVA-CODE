class  Narrowing5
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		short s = (short) ch;
		byte b = (byte) ch;
		
		System.out.println(ch);
		System.out.println(s);
		System.out.println(b);
	}
}
