	package arrays;
	
	public class DisplayPrimeNoOfArray {
	
		public static void main(String[] args) {
			
			int a[] = {
				    101, 45, 67, 89, 120, 233, 12, 19, 97, 150,
				    2, 4, 7, 11, 13, 15, 17, 21, 29, 31,
				    55, 77, 91, 103, 107, 109, 111, 113, 127, 131,
				    200, 211, 223, 227, 12, 18, 19, 23, 24, 29,
				    37, 41, 43, 47, 49, 53, 59, 61, 63, 67,
				    71, 73, 79, 83, 87, 89, 97, 99, 101, 103
				};
			
			for (int i = 0; i < a.length; i++) {
				if (isPrime(a[i])) {
					System.out.println(a[i]);
				}
			}
		}
		
		
		public static boolean isPrime(int num) {
			if (num<=1) {
				return false ;
			}
			
			for(int i=2; i<=Math.sqrt(num); i++) {
				if (num%i==0) {
					return false ;
				}
			}
			return true ;
		}
	}
