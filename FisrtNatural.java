import java.util.*;
	public class FisrtNatural
{
	public static void main ( String[] args)
{
	Scanner sc = new Scanner (System.in);
	System.out.println ("Enter your Number : ");
	int num = sc.nextInt();

	if(num<=0)
{
	System.out.println ( " Please Enter the Possitive Number"+ num);
}
	else
{
	int sum = num*(num+1)/2;
	System.out.println ("The Sum Of First Natural Number Is : " + sum);
}
}
}