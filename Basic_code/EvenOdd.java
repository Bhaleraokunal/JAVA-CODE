import java.util.*;
	class EvenOdd
{
	public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter your Number :");

	int num = sc.nextInt();

	if (num % 2 ==0)
     {
	System.out.println( "The Entered Number is even : " + num);
     }
	else
     {
	System.out.println(num + "This number is Odd");
     }
   }
}
