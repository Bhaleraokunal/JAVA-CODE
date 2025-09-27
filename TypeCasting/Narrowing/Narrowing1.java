class  Narrowing1
{
	public static void main(String[] args) 
	{
		double d = 106.106;
		float f = (float) d;
		long l = (long) d;
		int i = (int) d;
		char ch  = (char) d;
		short s = (short) d;
		byte b = (byte) d;
		
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(b);
	}
}
