package arrays;

public class HalfReverseAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10} ;
		
		int b [] = new int [a.length] ;
		
	
		for (int i = 0; i < a.length; i++) {
	 
			if(i< a.length/2) {
			b[i] = a[a.length/2-1-i] ;
			
			}else {
				b[i]=a[i];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
