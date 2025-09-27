package arrays;

import java.util.Iterator;

public class DupplicateArray {

	public static void main(String[] args) {
		
		int arr1 [] = {1,2,3,4,5,6,7,8,9,0} ;
		int arr2 [] = new int [arr1.length] ;
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
