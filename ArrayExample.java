package demo;
import java.util.*;
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //float[] marks={67.8f,89.5f,87.7f}; //static array
	float[] marks;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size:");
    int size=sc.nextInt();
    marks=new float[size];//dynamic array
    System.out.println("Enter the Marks:");
    for(int i=0;i<marks.length;i++) {
    	marks[i]=sc.nextFloat();
    }
    System.out.println("The marks are:");
    for(int i=0;i<marks.length;i++) {
    	System.out.println(marks[i]);
    	
    }
	}

}
