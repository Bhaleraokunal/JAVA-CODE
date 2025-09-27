class Compound1 
{
	public static void main(String[] args) 
	{
		int a = 20;
			a-=10; // a= a-10 == a = 10-20 therefor the valuse will be a= 10
			
		System.out.println(a); // 10
		
		int x=1000;
			x+= 25.98760;  // implicit narrowing int to double
		System.out.println(x); // 1025
		
		char ch = 'a';
		ch-=100;
		System.out.println(ch); // non printable character "?"
		
		int b = 100;
			b-='a';  // implict narrowing int to character
		System.out.println(b); // 3
	}
}
