package arrays;

import java.util.Arrays;

public class TwoPointerMerging {

	public static void main(String[] args) {
		int arr1[] = {1, 3, 5, 7, 9};
		int arr2[] = {2, 4, 6, 8, 10};

		
		System.out.println(Arrays.toString(merge(arr1, arr2))) ;
	}
	
	public static int[] merge(int a[], int b[]) {
		
		int ans [] = new int[a.length+b.length] ;
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length) {
			if (a[i]<b[j]) {
				ans[k++]=a[i++];
			}
			else if (a[i]>=b[j]) {
				ans[k++]=b[j++];
			}
		}
//		System.out.println(Arrays.toString(ans));
		while (i<a.length) {
			ans[k++]=a[i++];
		}
		while (j<b.length) {
			ans[k++]=b[j++] ;
		}
		return ans ;
	}
}
