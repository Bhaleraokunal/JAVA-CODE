package arraysString;

import java.util.Scanner;

public class FindingTheElements {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name that you what do find :");
		String value = sc.nextLine() ;
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
		if (findingOccurances(mixedArrayWithDuplicates, value) > 0) {
			System.out.println("The value is prsent in the array");
		} else {
			System.out.println("Sorry the value is not found !");
		}
		sc.close();
	}

	public static int findingOccurances(String a[], String value) {
		int count = 0 ;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(value)) {
				count++ ;
			}
		}
		return count ;
	}
}
