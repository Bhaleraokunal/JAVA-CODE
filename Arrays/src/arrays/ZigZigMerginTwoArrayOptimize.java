package arrays;

public class ZigZigMerginTwoArrayOptimize {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9} ;
		int b[] = {11,22,33,44,55,66,77,88,99} ;
		int c [] = new int [a.length + b.length] ;
		
		for (int i = 0; i <Math.max(a.length,b.length); i++) {
			if (i<a.length) {
				c[2*i] = a[i];
			}
			if (i<b.length) {
				c[2*i+1] = b
						[i];
				}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
