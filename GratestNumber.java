import java.util.*;
	 	
	class GratestNumber
{
	/* This code is about to find the gratest number in between 2 number which are define the user */

	public static void main (String[] args)
    {
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("Enter your first number"); //Taking first Number input.
	int FirstNumber = sc.nextInt();
	System.out.println ("Enter your second number");// Taking Second Number input.
	int SecondNumber = sc.nextInt();

	if (FirstNumber > SecondNumber) // Condition to filter the number.
      {
	System.out.println ("The gratest number is " + FirstNumber );
      }
	else
      {
	System.out.println ("The gratest number is " + SecondNumber );
      }
   }
}
