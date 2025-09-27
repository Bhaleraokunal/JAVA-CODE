class Increment1 
{
	public static void main(String[] args) 
	{
		int p = 13, q =-3, r= 86, s;
		
		p = q++ + r-- - --p;
		s = --p + --q;
		r = r-- + p-- - --q;
		System.out.println(p); // 69
		System.out.println(q); // -4
		System.out.println(r); //159
		System.out.println(s); //67
	}
}
		
