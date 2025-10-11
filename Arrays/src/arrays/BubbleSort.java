package arrays;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int a[] = {70,52,36,23,9};
		bubbleSort(a);
	}
	
	
	public static void bubbleSort(int a[]) {
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp ;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
