package lab7;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col ;
		int r=-1,c=-1;
		int lastNegative=0;
		System.out.println("Enter the matrix size:");
		
		System.out.print("Rows:");
		row=sc.nextInt();
		System.out.print("Coloumns:");
		col = sc.nextInt();
		int[][] array = new int[row][col];
		System.out.println("Array:");
		//Вивід матриці
		for(int i=0;i<row;i++) {
					
			for(int j=0;j<col;j++) {
				array[i][j]=(int) (Math.random()*20-10);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
				System.out.println();
		
				for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(array[i][j]<0) {
					lastNegative=array[j][i];
					r=j; c=i;
				}
			}
					
		}	
		String result = (lastNegative!=0)? "Last Negative: " + lastNegative + " in Row #"+(r+1)+" Coloumn #"+(c+1) : "There's no negative numbers";
		
				System.out.print(result);
	}
}
