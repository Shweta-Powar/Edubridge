//Read the Age of 5 students and display it by using array.
import java.util.*;
public class DynamicArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//datatype[] variablenae={values}; //static array 
		//datatype[] variablename=new datatype[size]; //dynamic array
		int[] age=new int[20]; // int[20]this will garbage collected
		
		age=new int[5];//new array of 5 blocks willbe created in heap memory
		System.out.println("enter the age ");
		for(int i=0;i<age.length;i++) //ForLoop for Reading values by User
		{
			age[i]=scanner.nextInt();
		}
		for(int i=0;i<age.length;i++) //normal ForLoop for Printing values
		{
			System.out.println(age[i]);
		}
		/*
		 * for(datatype variablename : arrayName)//Enhance ForLoop Only Use for Printing not for Reading Values
		 * {
		 * statements ;
		 * }
		 */
		for(int num : age) //Enhance forloop
		{
			System.out.println(num);
		}
	}
}
