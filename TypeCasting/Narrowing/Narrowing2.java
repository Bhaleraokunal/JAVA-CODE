class Narrowing2 
{
	public static void main(String[] args) 
	{
		float f = 106.106f;
		long l = (long) f;
		int i = (int) f;
		char ch = (char) f;
		short s = (short) f;
		byte b = (byte) f;
		
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(b);
	}
}
