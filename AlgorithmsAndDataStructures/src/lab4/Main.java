package lab4;
import java.util.*;
import java.util.Deque;
public class Main {

	public static void deque() {
		  Deque<Integer> deque = new ArrayDeque<>();

	        // Додавання елементів на початок і в кінець дека
	        deque.addFirst(1);
	        deque.addLast(2);
	        deque.addLast(3);
	        deque.addFirst(4);

	        System.out.println("Deque: " + deque);

	        // Метод для видалення елемента з початку дека (pop_front)
	        if (!deque.isEmpty()) {
	            int front = deque.removeFirst();
	            System.out.println("Removed from the start: " + front);
	        }

	        // Метод для видалення елемента з кінця дека (pop_last)
	        if (!deque.isEmpty()) {
	            int last = deque.removeLast();
	            System.out.println("Removed from the end: " + last);
	        }
	        System.out.println("First element: " + deque.getFirst());
	        System.out.println("First element: " + deque.getLast());
	        System.out.println("Size: " + deque.size());
	        
	        System.out.println("Updated Deque: " + deque);
	}

	public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanInput).reverse().toString();
        return cleanInput.equals(reversed);
    }

	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int k = 0;
		do {
			System.out.println("1.Task #1: ");
			System.out.println("2.Task #2: ");
			System.out.println("3.Task #3: ");
			System.out.println("4.Exit: ");
			k=sc.nextInt();

		switch(k){
		case 1: deque();
			break;
		case 2:
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the word: ");		
			String word;
			word = s.nextLine();
			boolean isPalindromic = isPalindrome(word);
		    System.out.println("Is Palindrome: " + isPalindromic);
		case 3:
		
		}
		
		}while(k!=4);
		sc.close();
		
	}
	
	
	public static void main(String[] args) {
		menu();		
	}

}
