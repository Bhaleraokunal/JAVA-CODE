import java.util.*;
	class GratestNumberInBetween3
{
	public static void main (String [] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter your first number : ");
	int number1 = sc.nextInt();
	System.out.println ("Enter your Second number :" );
	int number2 = sc.nextInt();
	System.out.println ("Enter your Third number : ");
	int number3 = sc.nextInt();

	if (number1 >= number2 && number1 >= number3)
{
	System.out.println ("The gratest number is : " + number1);
}
	else if (number2 >= number1 && number2 >= number3)
{
	System.out.println ("The gratest number is:" + number2);
}
	else 
{
	System.out.println("The gratest number is :" + number3);
}
}
}