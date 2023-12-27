package lab1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void menu() {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		//Default values of array
		for (int i = 0; i < 20; i++) {
			int num = rand.nextInt(21)-10 ;
			arr.add(num);
		}
		int k=0;
		do {
			System.out.println("1 - Fill the array.");
			System.out.println("2 - Print out the array.");
			System.out.println("3 - Task 1.");
			System.out.println("4 - Task 2.");
			System.out.println("5 - Exit.");
			k = scan.nextInt();
			switch(k) {
			case 1 : 
					arr.clear();	
					Array.fillArray(arr);
					System.out.println();
					break;
			case 2: Array.printArray(arr);
					System.out.println();
					break;
			case 3: Array.countRepeats(arr);
					System.out.println();
					break;
			case 4: 
					System.out.print("Old ");
					Array.printArray(arr);		
					while(true) {
						System.out.print("Enter the starting index: ");
						int index = scan.nextInt();
						if(index>arr.size() || index<0) {
							System.out.println("The index must be less than array size and more than 0");
						}
						else {
							System.out.print("Enter the element amount: ");
							int amount = scan.nextInt();
							Array.insertElements(arr, index, amount);
							System.out.println();
							break;
							}
						}
					break;
			}
		}while(k!=5);	
	}
	public static void main(String[] args) {
    	System.out.println("Project #1 by Tokariev Serhii");
		menu();
    }
}
