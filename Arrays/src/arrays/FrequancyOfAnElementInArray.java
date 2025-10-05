package arrays;

public class FrequancyOfAnElementInArray {
	
	public static void main(String[] args) {
		int a[]= {1,2,1,2,2,1,2,2,2,1,1,5 } ;
		int ans[] = frequancy(a) ;
		
		for (int i = 0; i < ans.length; i++) {
			
			if (ans[i]==-1) {
				System.out.println(a[i]);
			}
		}
		
		
		
	}
	
	public static int[] frequancy(int a[]) {
	
		int count[] = new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			int ct = 0 ;
			
			if (count[i]!=-1) {
				
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i]==a[j]) {
						ct++;
						count[j]=-1;
					}
				}
				count[i]=ct ;
			}
		}
		return count ;
	}
}
