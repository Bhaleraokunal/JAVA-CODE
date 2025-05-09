import java.util.*;
public class Negative
{
 	public static void main ( String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number that you want to check");
	int number = sc.nextInt();
	
	if ( number < 0)
{
	System.out.println( "this is the negative number");
}
	else
{
	System.out.println( "this number is positive number");
}
}
}