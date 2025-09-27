class StaticMethod1 
{
	static 
	{
		System.out.println("From the static block 1");
	}
		
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	
	static 
	{
		System.out.println("Form the static block 2");
	}
}
