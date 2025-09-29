package arrays;

public class MergingTwoArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9} ;
		int b[] = {11,22,33,44,55,66,77,88,99} ;
		int c [] = new int [a.length + b.length] ;

		for (int i = 0; i <c.length; i++) {
	
			if (i<a.length) {
				c[i]=a[i] ;
			} else {
				c[i] = b[b.length - (i - a.length) - 1];

				
			}
			 
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
