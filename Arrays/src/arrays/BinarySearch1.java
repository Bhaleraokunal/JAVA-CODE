package arrays;

import java.util.Scanner;

public class BinarySearch1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the element that you want to find :");
		int num = sc.nextInt();
		int a[]= {1,2,3,4,5,6,7,8,9} ;
		binarySearch(a, num);
		
		sc.close();
	}
	
	public static void binarySearch(int a[], int element ) {
		int start= 0, end= a.length-1;
		
		while (start <= end) {
			int mid = (start+end)/2 ;
			
			
			if (a[mid]==element) {
				System.out.println("Element is found!");
				break ;
			}
			else if (element < a[mid]) {
				end = mid-1 ;
			}
			else {
				start =mid+1 ;
			}
		}
		
		if (start > end ) {
			System.out.println("Element is not found!");
		}
		
	}
}
