package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingElementFromSpecificIndex {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9} ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index number :");
		int index = sc.nextInt();
		int b[]= new int [a.length-1] ;
		
		for (int i = 0; i < b.length; i++) {
	
			if (i<index) {
				b[i] = a[i];
			}
			else {
				b[i]=a[i+1];
			}
		}
		
		System.out.println(Arrays.toString(b));
		sc.close();
	}
}
