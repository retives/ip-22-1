package lab5;
import java.util.*;


public class Main {
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
		case 1: 
			IntTree intTree = new IntTree(); 

	    	System.out.print("Enter the number amount: ");
	    	int amount = sc.nextInt();
	    	for(int i=0;i<amount; i++) {
	    		System.out.print("Enter the number: ");
	    		int num = sc.nextInt();
	    		intTree.insert(num);
	    	}
	    	System.out.println("Tree:");
	    	intTree.printTree();
	    	System.out.println("Max number");
	    	System.out.println(intTree.findMax());

			break;
		case 2:
			CharTree charTree = new CharTree(); 
			System.out.println("Enter the word");
	    	sc.nextLine();
			String word =sc.nextLine();
			charTree.insertString(word);
			
			charTree.printTree();
			break;
		case 3:
			StringTree stringTree = new StringTree();
			System.out.print("Enter the words amount: ");
			amount = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<amount; i++) {
	    		System.out.print("Enter the word: ");
	    		word = sc.nextLine();
	    		stringTree.insert(word);
	    	}
			stringTree.printTree();
			System.out.print("Enter the starting letter:");
			char l = sc.next().charAt(0);
			stringTree.deleteNodesStartingWithLetter(l);
			stringTree.printTree();
		}
		
		}while(k!=4);
		sc.close();
	}
	
    public static void main(String[] args) {
    	menu();

    	}
    }

