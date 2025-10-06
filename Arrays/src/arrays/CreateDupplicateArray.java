package arrays;

import java.util.Arrays;

public class CreateDupplicateArray {
	
	public static void main(String[] args) {
		
		int a[] = { 1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(dupplicateArray(a)));
	}
	
	public static int[] dupplicateArray(int ar[]) {
		
		int dupArray [] = new int [ar.length];
		
		for (int i = 0; i<ar.length; i++) {
			dupArray[i]=ar[i];
		}
		return dupArray ;
	}
}
