package lab3;

import java.util.Scanner;

public class Main {

	public static void menu() {
		Scanner c = new Scanner(System.in);
		int k;
		do{
			System.out.println("1. Task #1 Enter the numbers from keyboard to stack");
			System.out.println("2. Task #2 Sort out even and odd numbers");
			System.out.println("3. Task #3 Check if sequence of brackets is correct");
			System.out.println("4. Exit");
		
			k = c.nextInt();
			switch (k) {
			case 1:
				Stack.addNums();
				System.out.println("\n--------------------------");
				break;
			case 2:
				Stack.sortStack();
				System.out.println("\n--------------------------");
				break;
			case 3:
				System.out.print("Enter the sequence of brackets: ");
				
				String seq = c.next();
				
				if (Stack.isValidSequence(seq) == true) {
					System.out.println(seq + " - This sequence is correct");
					
				} else{
					System.out.println(seq + " - This sequence is incorrect");
					}
				System.out.println("\n--------------------------");
			}
			
		}while (k != 4);
	}

	public static void main(String[] args) {
			menu();

	}
}
