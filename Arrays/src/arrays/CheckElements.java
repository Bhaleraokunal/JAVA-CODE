package arrays;

import java.util.Scanner;

public class CheckElements {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter the number that you want to find");
		int b = sc.nextInt() ;
		int a [] = {1,2,3,4,5,6,7,8,9,10} ;
		boolean found = false ;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				System.out.println("Element found ");
				found = true ;
				break ;
			} 
			
		}
		if (!found) {
			System.out.println("Sorry but the number is not present in the array ");
		}
		sc.close();
	}
}
