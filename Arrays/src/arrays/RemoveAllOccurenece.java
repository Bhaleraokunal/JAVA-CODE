package arrays;

import java.util.Arrays;

public class RemoveAllOccurenece {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,3,3,3,3,3,3,34,5,6};
		
		System.out.println(Arrays.toString(removeValue(a, 3)));
		
	}
	
	public static int[] removeValue(int a[], int value) {
		
		int count = 0 ;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==value) {
				count++ ;
			}
		}
		
		if (count > 0) {
			int ans [] = new int [a.length-count];
			
			for (int i = 0,j=0; i < a.length; i++) {
				if (a[i]!=value) {
					ans[j]=a[i];
					j++;
				}
				
			}
			return ans ;
		}
		return a; 
	}
}
