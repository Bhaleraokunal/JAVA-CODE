package arrays;

import java.util.Arrays;

public class QuickSort1 {

	public static void main(String[] args) {
		int a[]= {4,3,1,2,5,9,7,10,6} ;
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(int a[], int start, int end) {
		if (start < end) {
			int piviot = piviot(a, start, end) ;
			quickSort(a, start, piviot-1);
			quickSort(a, piviot+1, end);
		}
	}
	
	public static int piviot(int a[], int start, int end) {
		int i= start, j = end ; 
		int ref = a[start];
		
		while(i<j) {
			while(i<=a.length && a[i]<=ref) i++ ;
			while(j>=0 && a[j]>ref) j-- ;
			
			if (i<j) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp ;
			}
		}
		int temp=a[start] ;
		a[start]=a[j];
		a[j]=temp ;
		
		return j ;
	}
}
