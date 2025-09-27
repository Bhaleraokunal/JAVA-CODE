package polymorphism;

import java.util.Scanner;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator c1 = new Calculatro1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int num = sc.nextInt();
		
		
		for(int i=0;i<=num;i++) {
			for(int j=0; j<=num; j++) {
				if (i==0 || j==0 || j==num || i==num) {
					System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
			
		
		sc.close();
	}
	
	}
	public static int factor (int num)
	{
		int fact = 0;
		
		for(int i=1; i<=num/2; i++) {
			if (num%i==0) {
				fact++;
			}
		}
		return fact+1 ;
	}
	
	
	public static void box(int num)
	{
		for(int i=0;i<=num;i++) {
			for(int j=0; j<=num; j++) {
				if (i==0 || j==0 || j==num-1 || i==num-1) {
					System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

