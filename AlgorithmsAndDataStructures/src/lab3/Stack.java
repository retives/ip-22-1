package lab3;

import java.util.Scanner;

public class Stack {
	static Scanner sc = new Scanner(System.in);
	private static Node top;
	private int height;

	public class Node {
		char ch;
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(char ch) {
			this.ch = ch;
		}
	}

	// Конструктори
	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}

	public Stack() {
	};

	// Гетери
	public void printStack() {
		Node temp = top;
		System.out.print("Stack -> : ");
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;

		}
	}
	public void printChStack() {
		Node temp = top;
		System.out.print("Stack -> : ");
		while (temp != null) {
			System.out.print(temp.ch + " ");
			temp = temp.next;

		}
	}
	public void getTop() {

		System.out.println(top.value);
	}

	public void getHeight() {
		System.out.println(height);
	}

	// Метод для додавання елементів
	public void push(int value) {
		Node newNode = new Node(value);
		if (height == 0) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		height++;
	}

	public void push(char ch) {
		Node newNode = new Node(ch);
		if (height == 0) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		height++;
	}

	public Node pop() {
		if (height == 0)
			return null;
		else {
			Node temp = top;
			top = top.next;
			temp.next = null;

			height--;
			return temp;
		}
	}

	// завдання №1 додавання чисел в стек
	public static void addNums() {
		Stack numbers = new Stack();
		System.out.print("Enter the number amount: ");
		int amount = sc.nextInt();
		for (int i = 0; i < amount; i++) {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			numbers.push(num);
		}
		numbers.printStack();
	}

	// Завдання №2 сортування чисел в стеки
	public static void sortStack() {
		Stack even = new Stack();
		Stack odd = new Stack();

		System.out.println("Enter the number amount: ");
		int amount = sc.nextInt();
		for (int i = 0; i < amount; i++) {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();

			if (Math.abs(num) % 2 == 0)
				even.push(num);
			else
				odd.push(num);
		}
		System.out.print("-Even: ");
		even.printStack();
		System.out.println();
		System.out.print("-Odd:  ");
		odd.printStack();
	}

	public static boolean isValidSequence(String sequence) {
	    Stack stack = new Stack(); // Ваша реалізація стеку

	    for (char c : sequence.toCharArray()) {
	        if (c == '(' || c == '[' || c == '{') {
	            stack.push(c);
	        } else if (c == ')' || c == ']' || c == '}') {
	            if (stack.isEmpty()) {
	                return false;
	            }

	            if ((c == ')' && top.ch != '(') || (c == ']' && top.ch != '[') || (c == '}' && top.ch != '{')) {
	                return false;
	            }else {
	            	stack.pop();
	            }
	            
	        }
	    }
	    
	    return stack.isEmpty();
	}


	public boolean isEmpty() {
		return top == null; // Порожній стек має значення top рівне null
	}
}
