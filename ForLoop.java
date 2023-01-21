package demo;

public class ForLoop {

	public static void main(String[] args) {
System.out.println("0 to 10 Numbers:");		
		for(int i=0;i<=10;i++) {   //1 to 10
			System.out.println(i);
		}
System.out.println();
System.out.println("10 to 0 Numbers:");		
		for(int i=10;i>=0;i--) {  //10 to 0
			System.out.println(i);
		}
System.out.println();		
System.out.println("2's Table:");
		for(int i=2;i<=20;i=i+2) {
			System.out.println(i);
		}
	}

}
