class Increment2
{
	public static void main(String[] args) 
	{
		int a =5, b=7, c=9, d;
		
		d= a++ + b++ + ++c;
		b= ++d + ++a - c--;
		a= b- c++ + --d;
		c= c++;
		
		System.out.println(a); // 33
		System.out.println(b); // 20
		System.out.println(c); //10
		System.out.println(d); //22
	}
}
		
