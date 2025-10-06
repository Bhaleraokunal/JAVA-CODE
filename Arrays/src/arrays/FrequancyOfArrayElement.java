package arrays;

public class FrequancyOfArrayElement {
	
	public static void main(String[] args) {
		
		int array[] = {1,2,1,3,1,4,1,4,4,3,1,3,3,5,1,6,3,6,3,7,4,5,7,2,8 };
		int count[] = frequancy(array);
		
		
		for (int i = 0; i < array.length; i++) {
			int ct = 0 ;
			if (count[i]==-1) {
				ct++ ;
			}
			System.out.println(ct);
		}
	}
	public static int[] frequancy(int a[]) {
		
		int count[] = new int [a.length];
		
		for (int i = 0; i < count.length; i++) {
			
			int ct = 0 ;
			
			if (count[i]!=-1) {
				
				for (int j = 0; j < count.length; j++) {
					if (a[i]==a[j]) {
						ct++ ;
						count[j]=-1 ;
					}
				}
				count[i]=ct ;
			}
		}
		return count ;
	}
	
	public static void countAnArrayELement(int a[]) {
		
		
		int count [] =  frequancy(a) ;
		
		for (int i = 0; i < a.length; i++) {
			
			int ct = 0 ;
			
			if (count[i]!=-1) {
				
			
			for (int j=i+1; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					ct++ ;
				}
			}
			System.out.println("The "+ a[i]+ " is repeated "+ct+ "  time");
		}
	  }
		
	}

}
