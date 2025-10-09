package arrays;

import java.util.Arrays;

public class SegregatingAllEvenAndOddElement {
	
	public static void main(String[] args) {
		
		int a[] = {2,4,6,8} ;
		
		segregate(a);
	}

	
	public static void segregate(int a[]) {
		
		int i = 0, j = a.length-1 ;
		
		while(i<j) {
			
			while(a[i]%2==0) {
				i++ ;
				System.out.println(i);
			}
			while(a[j]%2!=0) {
				j-- ;
			}
			
			if (i<j) {
				int temp = a[i];
				a[i] = a[j] ;
				a[j] = temp ;
			}
			

			System.out.println(j);
		}
		
		System.out.println(Arrays.toString(a));
	}
}
