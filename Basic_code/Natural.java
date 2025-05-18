import java.util.*;

	public class Natural
{
	public static void main (String[] args)
    {
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Enter you number : ");
	int num = sc.nextInt();
	
	int sum = num*(num+1)/2;

	System.out.println ( "The sum of first n natural Number is " + sum);
    }
}
