package arrays;

public class RotatingArray {

	public static void main(String[] args) {
		
		int array [] = {1,0,1,1,0} ;
		for (int i = 0; i < array.length; i++) {
			
			if (isPalindrome(array)) {
				System.out.println("The given array it self palindrome");
				break ;
				
			}
			else if (isPalindrome(rotatArray(array))) {
				System.out.println("Eligle to be a palindrome");
				System.out.println("After "+i+ " time it will become palindrome");
				break ;
			}
		}
		
		
	}
	public static int[] rotatArray(int a[]) {
		
		int lastElment = a[a.length-1];
		int i;
		for ( i = a.length-1; i>0; i--) {
			
			a[i]= a[i-1];
		}
		a[i]=lastElment ;
		
		return a ;
	}
	
	
	public static boolean isPalindrome(int a[]) {
		
		for (int i = 0,j=a.length-1; i < j ; i++, j--) {
			if (a[i]!=a[j]) {
				return false ;
			}
		} 
		return true ;
	}
}
