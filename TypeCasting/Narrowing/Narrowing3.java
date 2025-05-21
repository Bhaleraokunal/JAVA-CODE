class Narrowing3 
{
	public static void main(String[] args) 
	{
		long l = 100006l;
		int i = (int) l;
		char ch = (char) l;
		short s = (short) l;
		byte b = (byte) l;
		
	
		System.out.println(l);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(b);
	}
}
