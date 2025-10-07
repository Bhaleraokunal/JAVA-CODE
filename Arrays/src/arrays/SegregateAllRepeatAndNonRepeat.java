package arrays;

import java.util.Arrays;

public class SegregateAllRepeatAndNonRepeat {
	
	public static void main(String[] args) {
		int array[] ={1,2,1,3,1,4} ;
		
		segregateInSingleArray(array);
	}

	public static int[] markDupp(int a[]) {
		
		int count[] = new int[a.length];
		
		for (int i = 0; i < count.length; i++) {
			int ct= 0;
			if (count[i]!=-1) {
				
				for (int j = i+1; j < count.length; j++) {
					if (a[i]==a[j]) {
						ct++;
						count[j]=-1 ;
					}
				}
				count[i]=ct ;
			}
		}
		return count ;
	}
	
	public static void segregateInSingleArray (int a[]) {
		
		int mark[]= markDupp(a);
		int index  = 0 ;
		
		System.out.println("Before segregating :");
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < mark.length; i++) {
			if (mark[i]==0) {
				
				int temp = a[index];
				a[index]=a[i];
				a[i]=temp ;
				index++;
			}
		}
		System.out.println("After segregating :");
		System.out.println(Arrays.toString(a));
	}
	
}
