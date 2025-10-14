	package arrays;

import java.util.Arrays;

public class QuickSort {

	
	public static void main(String[] args) {
		int a[] = {4,2,7,1,3} ;
		
		
	quickSort(a, 0, a.length-1);
//		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(int a[], int start, int end) {
		if (start<end) {
			int partition = partision(a, start, end) ;
			quickSort(a,start,partition-1) ;
			quickSort(a, partition+1, end);
		}
		
	}
	
	public static int partision(int a[],int start, int end) {
		int i=start , j=end;
		int ref = a[start] ;
		
		while (i<j) {
			while (i <= end && a[i] <= ref) i++;
			while (j >= start && a[j] > ref) j--;
			
			if(i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp ; 
		}
		}
				int temp = a[start];
				a[start] = a[j] ;
				a[j] = temp;
			System.out.println(Arrays.toString(a));
		
		return  j;
	}
}