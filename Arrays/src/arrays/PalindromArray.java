package arrays;

public class PalindromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,5,4,3,2,1} ;
		int i= 0;
		int j= a.length-1 ;
		
		for(; i<j;i++,j--) {
			if (a[i]!=a[j]) {
				break ;
			}
		}
		if (i>j) {
			System.out.println("not palindrome");
		}
		else {
			System.out.println("palindrom");
		}
	}
}
