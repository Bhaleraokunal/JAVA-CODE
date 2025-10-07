package arrays;

public class FindingTheMaxSubArray {

	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,1,5,1,-100,-10 } ;
		
//		int max = maxSubArray(a);
		
		System.out.println(maxSubArray(a));
	}
	
	public static int maxSubArray(int a[]) {
		int sum = 0 ;
		int curSum = 0 ;
		int max = Integer.MIN_VALUE ;
		int priviousMax = Integer.MIN_VALUE ; 
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			curSum+=a[i] ;
			
			if (curSum > max) {
				priviousMax = max ;
				max = curSum ;
			}
			else if (curSum < priviousMax) {
				curSum = 0 ;
			}
		}
		
		return max > sum ? max : sum ;
	}
}
