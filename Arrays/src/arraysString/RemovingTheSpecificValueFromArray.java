package arraysString;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingTheSpecificValueFromArray {
	
	public static void main(String[] args) {
		
		String[] mixedArrayWithDuplicates = {
			    "Kunal", "Sameera", "Rohan", "Priya", "Amit",
			    "Snow Leopard", "Indian Rhinoceros", "Tiger", "Elephant", "Dolphin",
			    "Apple", "Banana", "Mango", "Pineapple", "Strawberry",
			    "Car", "Bike", "Laptop", "Smartphone", "Watch",
			    "Giraffe", "Zebra", "Lion", "Koala", "Penguin",
			    "Orange", "Papaya", "Peach", "Blueberry", "Lemon",
			    "Computer", "Keyboard", "Mouse", "Monitor", "Printer",
			    "John", "Emma", "Olivia", "Noah", "Liam",
			    "Rabbit", "Horse", "Dog", "Cat", "Parrot",
			    "Watermelon", "Kiwi", "Coconut", "Pomegranate", "Guava",
			    "Table", "Chair", "Book", "Pen", "Bottle",
			    "Michael", "Sophia", "Ethan", "Isabella", "Mason",
			    "Bear", "Fox", "Wolf", "Camel", "Deer",
			    "Grapes", "Apricot", "Plum", "Cherry", "Lychee",
			    "Phone", "Tablet", "Camera", "Speaker", "Headphone",
			    "Aarav", "Ananya", "Vivaan", "Diya", "Ishaan",
			    "Shark", "Whale", "Otter", "Seal", "Frog",
			    "Mango", "Banana", "Apple", "Papaya", "Jackfruit",
			    "Fan", "Lamp", "Clock", "Door", "Window",
			    "Kunal", "Tiger", "Apple", "Laptop", "Dog",
			    "Banana", "Elephant", "Chair", "Emma", "Mango"
			};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select From the List :");
		System.out.println("1.Remove a specific value ");
		System.out.println("2. Remove all the occurances ");
		System.out.println("3. Count all the occrances ");
		
		int ip = sc.nextInt();
		sc.nextLine();
		
		switch (ip) {
		case 1: {
			System.out.println("Enter the String :");
			String value= sc.nextLine();
			System.out.println(Arrays.toString(removingElementFromStringArray(mixedArrayWithDuplicates, value)));
			break;
			
		}
		case 2 :{
			System.out.println("Enter the String :");
			String value= sc.nextLine();
			System.out.println(Arrays.toString(removingAllOccrances(mixedArrayWithDuplicates, value)));
			break;
		}
		case 3 : {
			System.out.println("Enter the String :");
			String value= sc.nextLine();
			System.out.println(occuranceOfElement(mixedArrayWithDuplicates, value));
			break;
		}
			
		}
		
		sc.close();
		
	}
	
	public static String[] removingElementFromStringArray(String a[], String value) {
		int i = 0 ;
		
		for ( i = 0; i < a.length; i++) {
			if (a[i].equals(value)) {
				break ;
			}
		}
		if (i<a.length) {
			
			String ar[]= new String[a.length-1];
			
			for (int j = 0,k=0; j < a.length; j++) {
				if (!a[j].equals(value)) {
					ar[k]= a[j];
					k++ ;
				}
			}
			return ar ;
		}
		return a ;
	}
	
	public static int occuranceOfElement(String a[], String value) {
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(value)) {
				count++ ;
			}
		}
		return count ;
	}
	
	public static String[] removingAllOccrances(String a[], String value) {
		
		int count = occuranceOfElement(a, value);
		
		if (count > 0) {
			
			String  ar[] = new String [a.length-count];
			
			for (int i = 0,k=0 ; i < a.length; i++) {
				if (!a[i].equals(value)) {
					ar[k]=a[i];
					k++;
				}
			}
			return ar ;
		}
		return a ;
	}

}
