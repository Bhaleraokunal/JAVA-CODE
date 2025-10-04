package arrays;

public class FindTheMaxElementInArray {

	public static void main(String[] args) {
		
		int a[] = {4823, 1592, 7465, 3201, 8942, 675, 2981, 7320, 451, 6109,
			    2157, 9034, 781, 6402, 1948, 8376, 5271, 3620, 7812, 4893,
			    1256, 9973, 4312, 6708, 2581, 8951, 7432, 3104, 5698, 2215,
			    8083, 3921, 6674, 1472, 5346, 921, 7834, 2689, 4992, 3867,
			    6148, 2059, 7345, 879, 9102, 4635, 2178, 6911, 3824, 5539,
			    8291, 4716, 3682, 1045, 6357, 2874, 9128, 1503, 7459, 3301,
			    5812, 4627, 3951, 8014, 2985, 6740, 2107, 9231, 4870, 5629,
			    7431, 3215, 8196, 2784, 9362, 1347, 6205, 4897, 7598, 3901,
			    5724, 2109, 8888, 4376, 6112, 1549, 7945, 2813, 6952, 4681,
			    3207, 8674, 2951, 7063, 1520, 8917, 4783, 6031, 3694, 8320 } ;
		
		
		System.out.println(maxElement(a));
		System.out.println(secMax(a));
		}
		

	
	public static int maxElement(int a[]) {
		int max = Integer.MIN_VALUE ;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max= a[i];
				index = i;
			}
		}
		return index ;
	}
	
	public static int minElement(int a[]) {
		int min = Integer.MAX_VALUE ;
		int index = 0  ;
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min = a[i];
				index = i ;
			}
		}
		return index ;
	}
	
	public static int secMax(int a[]) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				secMax=max;
				max=a[i];
			}
			else if (a[i]>secMax && a[i]!=max) {
				secMax = a[i];
				index = i ;
			}
		}
		return index;
	}
	
	public static int secMin(int a[]) {
		int min = Integer.MAX_VALUE ;
		int secMin = Integer.MAX_VALUE ;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]< min) {
				secMin = min ;
				min = a[i];
			}
			else if (a[i]<secMin && a[i]!= min) {
				secMin = a[i];
			}
		}
		return secMin;
	}
}
