package lab2;

import java.time.LocalDate;
import java.util.Scanner;
public class Main {

	public static void menu() {
		int i=0;
		Scanner sc = new Scanner(System.in);
		do {
		LinkedList list = new LinkedList();
		LinkedList charList = new LinkedList();
		
		System.out.println("1. Task #1, creating a LL from numbers from keyboard");
		System.out.println("2. Task #2, making a list from a word ");
		System.out.println("3. Task #3, making a linked list from a word ");
		System.out.println("4. Task #4, Family");
		System.out.println("5.Exit");
		
		
		i=sc.nextInt();
		switch(i) {
		case 1: 
			
			list.numAdding();
			list.printList();
			break;
		case 2:
			
			charList.stringToList();
			break;
		case 3:
			charList.stringToLinkedList();
			charList.printCharList();
			break;
		case 4:
			families();
			break;
		case 5: break;
		}
		}

		while(i!=5);
		sc.close();
	}
	public static  void families() {
		LinkedListFamily families = new LinkedListFamily();
		//Petrenko Family
		Family petrenko = new Family();
		//public Person(String firstName, String secondName, LocalDate birthday, String job)
		Person anna = new Person("Anna", "Petrenko",LocalDate.of(1985, 11, 9),"Manager", 20000);
		Person oleksii = new Person("Oleksii", "Petrenko", LocalDate.of(1983, 5, 21),"Lawyer",34500);
		Person oleksandr = new Person("Oleksandr", "Petrenko", LocalDate.of(2006, 3, 15),"Unemployed",0);
		petrenko.setHusband(oleksii);
		petrenko.setWife(anna);
		petrenko.addChild(oleksandr);

		
		//Johnsons family
		Family johnsons = new Family();
		
		Person robert = new Person("Robert", "Johnson", LocalDate.of(1975, 9, 4), "CEO", 40000);
		Person suzan = new Person("Suzan", "Johnson", LocalDate.of(1986, 6, 7), "Unemployed",0);
		Person roger = new Person("Roger", "Johnson", LocalDate.of(2000, 9, 29), "Software engineer", 25000);
		Person victor = new Person("Victor", "Johnson", LocalDate.of(2004, 1,5), "Unemployed",0);
		Person ginny = new Person ("Ginny", "Johnson", LocalDate.of(2007, 12, 1), "Unemployed",0);
		
		johnsons.setHusband(robert);
		johnsons.setWife(suzan);
		johnsons.addChild(ginny);
		johnsons.addChild(roger);
		johnsons.addChild(victor);
		families.append(petrenko);
		families.append(johnsons);
		Scanner scan = new Scanner(System.in);
		int k;
		do {
			System.out.println("1.Print all the families");
			System.out.println("2.Print all employed wives");
			System.out.println("3.Print all people with income less than 10000");
			System.out.println("4.Print all families with 3 children or more");
			System.out.println("5.Exit");
			k=scan.nextInt();
			switch(k) {
			case 1: families.printFamilies();
					System.out.println();
					break;
			case 2: 
				families.checkEmployedWives();
				System.out.println();
				break;
			case 3:
				families.checkIncome();
				System.out.println();
				break;
			case 4: 
				families.childrenAmount();
				System.out.println();
				break;
			case 5:
				break;

			}
		}while(k!=5);
		scan.close();
		
	}
	
	public static void main(String[] args) {
		
		
		menu();
		
	}

}
