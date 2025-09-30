package arrays;

public class FindingElementInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9} ;
		int element =9 ;
		int i = 0 ;
		
		for (; i < a.length; i++) {
			
			if (a[i]==element) {
				break ;
			}
		}
		if (i==a.length) {
			System.out.println("Element is not found");
		} else {
			System.out.println("Element is found at "+i+" Index");
		}
	}
}
