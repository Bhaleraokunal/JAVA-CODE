import java.util.*;
	class NaturalNumber
{
	public static void main(String[]args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Starting number :");
	int start= sc.nextInt();
	int n = 10;
	int end = start + n -1;
	int sum = n*(start + end)/2;
	System.out.println(sum);
    }
}
