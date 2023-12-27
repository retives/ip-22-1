package lab8;
import java.util.*;
public class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input N and M
	        System.out.println("Enter N (1 < N < 256): ");
	        int N = scanner.nextInt();

	        System.out.println("Enter M (1 < M < 256): ");
	        int M = scanner.nextInt();

	        // Input sequence of N keys
	        Integer[] sequenceN = new Integer[N];
	        for (int i = 0; i < N; i++) {
	            sequenceN[i] =(int) (Math.random()*20-10);
	        }

	        // Input sequence of M keys
	        Integer[] sequenceM = new Integer[M];
	        for (int i = 0; i < M; i++) {
	            sequenceM[i] = (int) (Math.random()*20-10);
	        }

	        // Sorting the sequence of N keys using quicksort
	        quickSort(sequenceN, 0, N - 1);
	        System.out.println("Sequence of M keys: " + Arrays.toString(sequenceM));
	        // Output the sorted sequence
	        System.out.println("Sorted sequence of N keys: " + Arrays.toString(sequenceN));
	        
	        // Binary search for each element in the second sequence
	        System.out.println("Binary search results:");

	        for (int i = 0; i < M; i++) {
	            int index = binarySearch(sequenceN, sequenceM[i]);
	            if (index != -1) {
	                System.out.println("Element " + sequenceM[i] + " is present in the sequence at position " + (index + 1));
	            } else {
	                System.out.println("Element " + sequenceM[i] + " is not found in the sequence");
	            }
	        }
	        
	        Integer[] array1 = sequenceN;
	        Integer[] array2 = sequenceM;

	        Set<Integer> set = new HashSet<>(Arrays.asList(array1));
	        set.addAll(Arrays.asList(array2));
System.out.println("Array union");
	        System.out.println(set);
	        }
	    
	

	    // QuickSort
	    private static void quickSort(Integer[] arr, Integer low, Integer high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);

	            quickSort(arr, low, pi - 1);
	            quickSort(arr, pi + 1, high);
	        }
	    }

	    private static int partition(Integer[] arr, Integer low, Integer high) {
	        double pivot = arr[high];
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;

	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    // BinarySearch
	    private static int binarySearch(Integer[] arr, Integer key) {
	        int low = 0, high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1;
	    }
}
