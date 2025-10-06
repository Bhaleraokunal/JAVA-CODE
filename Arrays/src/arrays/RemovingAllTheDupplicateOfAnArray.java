package arrays;
import java.util.Arrays;

public class RemovingAllTheDupplicateOfAnArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,1,1,1,2,2,3,4,5,5,6,7,8,7,5,3,2,5,67,8} ;
		int ct=0 ;
		
		int count[] = frequency(arr);
		
		for (int i = 0; i < count.length; i++) {
			if (count[i]==-1) {
				ct++ ;
			}
		}
		
		int noDupplicateElement[] = new int[arr.length-ct];
		
		for (int i = 0,j=0; i < arr.length; i++) {
			if (count[i]!=-1) {
				noDupplicateElement[j]=arr[i];
				j++;
			}
		}
		
		
		System.out.println(Arrays.toString(noDupplicateElement));
		
	}

	public static int[] frequency(int[]a) {
		
		int count[]= new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			int ct=0 ;
			
			if (count[i]!=-1) {
				
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i]==a[j]) {
						ct++;
						count[j]=-1;
					}
				}
				count[i]=ct ;
			}
		}
		return count ;
	}
	
}
