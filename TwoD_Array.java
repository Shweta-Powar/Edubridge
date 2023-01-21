//2d array - collection of single dimensional array
//Read & Display Marks of 3 subj of 3 Students in 2D array
import java.util.*;
public class TwoD_Array {
	
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int[][] marks=new int[3][3];
			//reading values from user
			System.out.println("Enter the values");
			for(int i=0;i<marks.length;i++)
			{
				for(int j=0;j<3;j++)//11,12,17
				{
					marks[i][j]=scanner.nextInt(); //reading input from user
				}
				
			}
			//directly assing values in array
			/*int[][] marks=new int[][] {
				{10,15,20},
				{11,12,17},
				{13,17,18}
				
			}; 
			/*
			 * for(int i=0;i<marks.length;i++)//3 { for(int j=0;j<3;j++)//0 {
			 * System.out.print(marks[i][j]+" ");//10 } System.out.println(); }
			 */
			//char[] values= {'1','2','3'};
			//for(char ch : values)
			//{ }
			for(int[] mark : marks) //Enhance ForLoop for 2D array
			{
				for(int m : mark)//11,12,17
				{
					System.out.print(m+" ");
				}
				System.out.println();
			}
			
			
			
		}
}
