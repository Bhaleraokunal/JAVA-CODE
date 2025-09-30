package arrays;

public class MergingTwoArrayAtSpecificIndex {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {10,20,30,40,50,60,70};
		
		int ans[] = new int [a.length + b.length];
		
		for(int i=0,j=0,k=0; k<ans.length ; k++) {
			int index = 5 ;
			if (i<index || (j==b.length)) {
				ans[k] = a[i];
				i++ ;
			}
			else if (j<b.length) {
				ans[k]=b[j];
				j++;
			}
		}
	}
}
