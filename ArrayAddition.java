
import java.util.Scanner;
public class ArrayAddition {
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	int[] a = new int[5];
	int[] b = new int[5];
	int[] c = new int[5];
	System.out.println("Enter the array of a:");
	for (int i = 0; i < a.length; i++) {
	a[i] = obj.nextInt();
	}
	System.out.println("Enter the array of b:");
	for (int i = 0; i < b.length; i++) {
	b[i] = obj.nextInt();
	}
	for (int i = 0; i < 5; i++) {
	c[i] = a[i] + b[i];
	}
	System.out.println("The addition of array a and array b is: ");
	for (int i = 0; i < 5; i++) {
	System.out.println(c[i]);
	}}}
