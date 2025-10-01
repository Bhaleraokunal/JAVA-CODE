package arrays;

import java.util.Arrays;

public class CheckIfTheElementIsPresentInArrayIfPresentThenRemove {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9} ;
		
		System.out.println(Arrays.toString(checkElement(array, 6)));
	}
	
	public static int[] checkElement(int a[],int value) {
		int index = 0 ;
		
		for ( index = 0; index < a.length; index++) {
			if (a[index]==value) {
				break ;
			}
		}
		
		if (index<a.length) {
			
			int ans[] = new int [a.length-1];
			
			for (int i = 0; i < ans.length; i++) {
				if (i<index) {
					ans[i]=a[i];
				}
				else {
					ans[i]= a[i+1];
				}
			}
			return ans ;
		}
		return a ;
	}
	
}
