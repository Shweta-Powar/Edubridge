package demo;
import java.util.*;
public class sample {

public static void main(String[] args) {
int temp=0;		
Scanner sc= new Scanner(System.in);
System.out.println("Enter Num1:");
int num1=sc.nextInt();
System.out.println("Enter Num2:");
int num2=sc.nextInt();
//Swapping by using temp variable
temp=num1;
num1=num2;
num2=temp;
//Swapping without using temp variable
/*num1=num1-num2;
num2=num1+num2;
num1=num2-num1;
*/
System.out.println("Num1="+num1);
System.out.println("Num2="+num2);
sc.close();
	}

}
