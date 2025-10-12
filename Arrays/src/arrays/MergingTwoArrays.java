package arrays;

import java.util.Arrays;

public class MergingTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,9,8,11} ;
		int b[]= {2,3,4,5,98,100 } ;
		
		System.out.println(Arrays.toString(mergeTwoArray(a, b)));
	}
	
	public static int[] marking(int a[]) {
		int mark[] = new int [a.length] ;
		
		for (int i = 0; i < mark.length; i++) {
			int ct = 0 ;
			if (mark[i]!=-1) {
				for (int j = i+1; j < mark.length; j++) {
					if (a[i]==a[j]) {
						ct++ ;
						mark[j]=-1 ;
					}
				}
				mark[i]=ct ;
			}
		}
		return mark ;
	}
	
	public static int[] mergeTwoArray(int a[], int b[]) {
		int merge[] = new int[a.length+b.length];
		int k = 0 ;
		
		for (int i = 0; i < a.length; i++) {
			merge[k]=a[i];
			k++;
		}
		for (int i = 0; i < b.length; i++) {
			merge[k++]=b[i] ;
		}
		int mark[] = marking(merge);
		int index = 0 ;
		int ans[] =  new int [merge.length] ;
		
		for (int i = 0; i < mark.length; i++) {
			if (mark[i]>0) {
				ans[index++] = merge[i] ;
				ans[index++] = merge[i] ;
			}
		}
		for (int i = 0; i < mark.length; i++) {
			if(mark[i]==0) {
				ans[index++] = merge[i] ;
			}
		}
		return ans ;
	}
	
	

}



