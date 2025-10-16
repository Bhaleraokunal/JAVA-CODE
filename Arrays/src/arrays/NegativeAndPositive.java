package arrays;

import java.util.Arrays;

public class NegativeAndPositive {

	public static void main(String[] args) {
		int a[] = {1,2,3,-4,-3,-2} ;
		segregate(a);
	}
	
	public static void segregate(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			if (i%2==0 && a[i]<0) {
				int j ;
				for ( j = i+1; j < a.length; j++) {
					if (a[j]>=0) {
						break ;
					}
				}
			
			if (j<a.length) {
				int temp = a[i] ;
				a[i] = a[j] ;
				a[j] = temp ;
			}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
