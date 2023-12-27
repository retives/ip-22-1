package lab2;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
public class LinkedList {
	Scanner scan = new Scanner(System.in);
	Node head;
	Node tail;
	int length=0;
	//Node class

public class Node{
		int value;
		char letter;
		Node next;
		public Node(int value) {
			this.value = value;
		}
		public Node(char letter) {
			this.letter = letter;
		}
	}
	//Getters, we don't need setters
	public Node getHead() {
		return head;
	}
	public Node getTail() {
		return tail;
	}
	public int getLength() {
		return length;
	}
	
	public LinkedList() {	
	}

	//Method to add elements in the end of LL
	public void append(int value) {
		Node newNode = new Node(value);
		if (length ==0) {
			head = newNode; 
			tail = newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		length++;
	}
	//Method that adds chars if we deal with chars
	public void append(char letter) {
		Node newNode = new Node(letter);
		if (length ==0) {
			head = newNode; 
			tail = newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		length++;
	}
	//Method to print out a LL
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp=temp.next;
		
		}
		System.out.println('\n');
	}
	public void printCharList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.letter + " ");
			temp=temp.next;
		
		}
		System.out.println('\n');
	}
	//Task #1 - "Create a program to add the numbers, entered from the keyboard
	public void numAdding() {
		System.out.println("Enter the amount of number: ");
		int amount = scan.nextInt();
		for(int i=0; i<amount; i++) {
			System.out.println("Enter the number: ");
			int num = scan.nextInt();
			this.append(num);
		}
	}
	
	//Task 3
	public void stringToLinkedList() {
		System.out.println("Enter the word: ");
		String word = scan.nextLine();
		for(int i=0; i<word.length(); i++) {
			this.append(word.charAt(i));
		}
	}
	//Task 2
	public void stringToList() {
		System.out.println("Enter the word: ");
		String word = scan.nextLine();
		ArrayList<Character> letters = new ArrayList<Character>();
		for(int i=0; i<word.length(); i++) {
			letters.add(word.charAt(i));
		}
		for( Character i: letters) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	
	
}
