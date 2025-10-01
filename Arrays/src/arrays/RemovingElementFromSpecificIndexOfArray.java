package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingElementFromSpecificIndexOfArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your index number :");
		int index = sc.nextInt();
		int array[] = {1,2,3,4,5,6,7,8} ;
		
		System.out.println(Arrays.toString(removeElement(array, index)));
	
		sc.close();
	}
	
	public static int[] removeElement(int ar[], int index) {
		
		if (index >=0 && index < ar.length) {
			
			
			int ans[]= new int[ar.length-1] ;
			
			for (int i = 0; i < ar.length; i++) {
				
				if (i < index) {
					ans[i]=ar[i];
				}
				else if(i> index){
					ans[i-1] = ar[i];
				}
			}
			return ans ;
		}
		return ar ;
	}
}
