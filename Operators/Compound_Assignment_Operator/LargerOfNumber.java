class LargerOfNumber 
{
	public static void main(String[] args) 
	{
		int n1 = 12;
		int n2 = 31;
		int n3 = 1;
		
		// First way.
		
		int large = n1 > n2 ? n1 : n2;
		int largest = large> n3? large : n3;
		System.out.println(largest);
		
		// Second way.
		
		int largest1 = n1 > n2  ? (n1>n3? n1 : n3) : (n2>n3 ? n2 : n3) ;
		System.out.println(largest1);
		
		//Third way 
		
		int largest2 = n1>(n2>n3 ? n1 : n2) ? n1 : (n2>n3 ? n2: n3);
		System.out.println(largest2);
		
		// Fourth Way
		
		int large1;
		int largest3 = ( large1 = n1> n2 ? n1 : n2) > n3 ? large : n3;
		System.out.println(largest3);
		
		//Fifth way
		
		int largest4 = (n1>n2 ? n1 : n2 ) > n3 ?  (n1 > n2 ? n1 : n2) : n3;
		System.out.println(largest4);
	}
}
