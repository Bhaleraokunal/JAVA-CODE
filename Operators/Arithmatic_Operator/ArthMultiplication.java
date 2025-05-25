class ArthMultiplication
{
	public static void main(String[] args) 
	{
		byte a = 2 ; 
		byte b = 5 ; 
		int result1 = a * b;  //casue error if try to store the result in byte 
		
		short s1 = 200 ; 
		short s2 =500 ;
		int result2 = s1 * s2 ; //casue error if try to store the result in short
		
		char c1 = 'a';
		char c2 = 'b';
		int result3 = c1 * c2; //casue error if try to store the result in char result will be according to ASCII Vales.
		
		int i1 = 40000;
		int i2 = 60000;
		int result4 = i1 * i2 ;
		
		long l1 = 3000l;
		long l2 = 5000l;
		long result5 = l1 * l2;
		
		float f1 = 1.1f;
		float f2 = 2.2f;
		float result6 = f1 * f2;
		
		double d1 = 1.1;
		double d2 = 2.2;
		double result7 = d1 * d2 ;
		
		
		// Print all the results 
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println("End of Multiplication result");
	}
}