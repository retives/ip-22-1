package lab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public abstract class Array {
	public static final int arraySize = 100;
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	
	//Filling the array 
	public static boolean fillArray(ArrayList<Integer> array) {
		while(true) {
			
			System.out.print("Enter the amount of elements: ");
			int amount = scan.nextInt();
			
			if(amount <0) {
				System.out.println("The amount of elments can't be less than 0");
			}
			else if(amount > arraySize){
				System.out.println("The amount of elments can't be more than 100");
			}
			
			else {
				System.out.print("Enter the upper limit: ");
				int upperLimit=scan.nextInt();
				for (int i = 0; i < amount; i++) {
					int num = rand.nextInt(Math.abs(upperLimit)*2+1)-Math.abs(upperLimit) ;
					array.add(num);
				}
				System.out.println("Array has been created and filled succesfuly");
						return true;
						}
				}
			}
		//end
	
		//printing out the array
	public static boolean printArray(ArrayList<Integer> array) {
		//in case array is empty we return the error
		if(array.size()==0) {
			System.out.println("The array is empty");
			return false;
		}
		//or else we print it out
		System.out.println("Array: ");
		for (int i = 0; i <array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
		System.out.println();
		return true;
	}


		//task number 1	
	public static void countRepeats(ArrayList<Integer> array) {
		//If numbers will repeat they will be added to Hash Map with template <"value":"timesRepeated">
		HashMap<Integer, Integer> repNum = new HashMap<>();  
		for (int j = 0; j < array.size(); j++) {
	            int repForEach = 0;
	            for (int k = 0; k < array.size(); k++) {
	                //in this 2 loops we loop through the array, compairing numbers each to others
	            	if (j != k && array.get(j) == array.get(k)) {
	                    //if numbers are repeating and they aren't with the same index, we increase the iterator of reps for certain number 
	            		repForEach++;
	            		//and after looping through the array we check if this number is already in HashMap, if not we add it 
	            		if (!repNum.containsKey(array.get(j))) {
	                        repNum.put(array.get(j), repForEach);
	                    }
	                }
	            } 
	        }

	        int repTimes = 0;
	        for (int count : repNum.values()) {
	            repTimes += count;
	        }
	        printArray(array);
	        System.out.println("Amount of repeats: " + repTimes);

	        //loop through repNum HashMap and print out the numbers with the repeat amount
	        for (int i : repNum.keySet()) {
	        	System.out.println("Number " + i + " repeated " + repNum.get(i) + " times");
	            
	        	}
	}

		///task number 2, inserting the certain amount of elements from certain index, by entering those numbers from keyboard
	public static void insertElements(ArrayList<Integer> array, int index, int amount) {
		int size = array.size();

		int num=0;
		//if the index is equal to the array's size the following numbers will just be appended
		if(index==array.size()){
			for(int i=index; i<index+amount; i++) {
				System.out.println("Enter the new number("+(index+amount-i)+" left) : ");
				num = scan.nextInt();
				array.add(num);
			}
		}
		//or in any other case the elements need to be moved to insert new numbers
		else {
			for(int i=0;i<amount;i++) {
				array.add(0);
			}
			for(int i=size; i>index;i--) {
				array.set(i+amount-1, array.get(i-1));
			}
			System.out.println();
			for(int i=index; i<index+amount; i++) {
				System.out.println("Enter the new number("+(index+amount-i)+" left) : ");
				num = scan.nextInt();
				array.set(i, num);
			}
		}
		
		System.out.print("New");
		Array.printArray(array);
		
	}
	}
