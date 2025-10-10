package arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int a[] = {70,52,36,23,9}; 
		
		binarySearch(a, 23);
	}
	
	
	public static void binarySearch(int a[], int element) {
		a = bubbleSort(a) ;
		int start=0 , end = a.length-1;
		
		while(start<=end) {
		int mid = (start+end)/2 ;
		
		if (a[mid] == element) {
			System.out.println("Element found at "+mid +" index");
			break ;
		} else if(element < a[mid]) {
			end = mid - 1 ;
		}
		else {
			
			start = mid +1 ;
		}

	}
	}
	public static int[] bubbleSort(int a[]) {
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp ;
				}
			}
		}
		return a ;
	}

}
