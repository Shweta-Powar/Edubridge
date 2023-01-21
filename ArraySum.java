//find sum of 10 values stored in the array
import java.util.*;
public class ArraySum {
	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			//find sum of 10 values stored in the array
			int[] num=new int[10];
			int sum=0;
			System.out.println("enter the 10 values");
			for(int i=0;i<num.length;i++)
			{
				num[i]=scanner.nextInt();
			}
			for(int n : num)
			{
				sum+=n; //sum=sum+n
				System.out.println(n);
			}
			System.out.println("sum--->"+sum);
			
			
		}
}
