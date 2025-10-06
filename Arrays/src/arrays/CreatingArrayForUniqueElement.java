package arrays;

import java.util.Scanner;

public class CreatingArrayForUniqueElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		
		uniqueArray(arr);
		
		sc.close();
	}
	
	

	public static int[] markDuplicates(int arr[]) {
		int markDupplicate[] = new int[arr.length];
		
		for (int i = 0; i < markDupplicate.length; i++) {
			int ct = 0 ;
			if (markDupplicate[i]!=-1) {
				for (int j = i+1; j < markDupplicate.length; j++) {
					if (arr[i]==arr[j]) {
						ct++;
						markDupplicate[j]=-1;
					}
				}
				markDupplicate[i]=ct;
			}
		}
		return markDupplicate;
	}
	
	public static void uniqueArray(int arr[]) {
		int marrDupplicate[] = markDuplicates(arr);
		for (int i = 0; i < marrDupplicate.length; i++) {
			if (marrDupplicate[i]==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
