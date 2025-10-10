package arrays;

public class Array {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6} ;
		int b[] = {7,8,9,0,10,11} ;
		int c[] =  new int[a.length + b.length];
		
		for (int i = 0; i < c.length; i++) {
			if (i<a.length){
				c[i]=a[i];
			}
			else {
				c[i] = b[i - a.length];
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
