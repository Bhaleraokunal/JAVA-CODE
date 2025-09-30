package arrays;

public class ZigZagArrayMerging {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9} ;
		int b[] = {11,22,33,44,55,66,77,88,99,0,9} ;
		int c [] = new int [a.length + b.length] ;
		int mem = 0 ;
		int i = 0 ;
		for ( i = 0; i < Math.max(a.length, b.length); i++) {
			if (i<a.length) {
				c[mem++] = a[i] ;
			}
			if (i<b.length) {
				c[mem++] = b[i] ; 
			}
		}
		
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		
		System.out.println(i);
	}
}
