package arrays;

public class FindingTheMaxSubArray {

	
	public static void main(String[] args) {
		int a[] = {-2, 1} ;
		
//		int max = maxSubArray(a);
		
		System.out.println(maxSubArray(a));
	}
	
	public static int maxSubArray(int a[]) {
		
		int curSum = 0 ;
		int max = Integer.MIN_VALUE ;
		
		for (int i = 0; i < a.length; i++) {
			curSum+=a[i];
			
			if (curSum > max) {
				max =  curSum ;
			}
			if (curSum < 0 ) {
				curSum = 0;
			}
		}
		return max ;
	}
}
