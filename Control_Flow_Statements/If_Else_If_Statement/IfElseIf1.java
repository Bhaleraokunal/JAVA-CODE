import java.util.Scanner;
class  IfElseIf1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter you marks");
		double per = sc.nextDouble();
		
		if (per>=0 && per<35)
		{
			System.out.println("Fail ! sucide mat karo");
		}
		else if (per==35)
		{
			System.out.println("just pass! party karo");
		}
		else if (per >=35 && per<60)
		{
			System.out.println("Second class! join Qpsider");
		}
		else if (per >=60 && per<75)
		{
			System.out.println("First class ! Eligible for the interview");
		}
		else if (per>=75 && per<90)
		{
			System.out.println("First class with disntiction ! good job");
		}
		else if (per>=90 && per<=100)
		{
			System.out.println("Topper ! dont spoil 10 logo ka peace");
		}
		else 
		{
			System.out.println("Hope you are not from this planet");
		}
	}
}
