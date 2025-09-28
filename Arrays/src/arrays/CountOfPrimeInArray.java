package arrays;

public class CountOfPrimeInArray {

	public static void main(String[] args) {
		
		int a[] = {21,31,43,12,23,12,233,123,12,900} ;
		int count = 0 ;
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				count++ ;
			}
		}
		System.out.println(count);
		
		
		System.out.println(Math.sqrt(21));
		System.out.println(21/2);
	}
	
	public static boolean isPrime(int num) {
		if (num<=1) {
			return false ;
		}
		for(int i=2; i<num/2; i++) {
			if (num%i==0) {
				return false ;
			}
		}
		return true ;
	}
}
