class NegativeToPossitive1 
{
	public static void main(String[] args) 
	{
		int num = -98;
		System.out.println("The number before the conversion is :"+ num);
		
		
		int store = Math.abs(num); // static method inside the Math pre-defined class.
		
		
		System.out.println("The number after the conversion is :"+ store);
	}
}
