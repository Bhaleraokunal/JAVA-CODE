import java.util.*;
	class RangeFind
{
	public static void main (String [] args)
{
	Scanner sc = new Scanner (System.in);
	System.out.println ("Enter the Starting number :");
	int start = sc.nextInt();
	System.out.println ("Enter the Ending number :");
	int end = sc.nextInt();
	int n = end - start +1;
	int sum = n*(start+end)/2;
	System.out.println(sum);
}
}