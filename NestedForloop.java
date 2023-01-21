package demo;

public class NestedForloop {

	public static void main(String[] args) {
//Program 1 for create * patters
		//*
	    //** 
	    //*** 
		//**** 
		//*****
	System.out.println("Program 1:");
	for(int j=1;j<=5;j++) //1st for loop is for rows //1<=5
{
	for(int i=1;i<=j;i++) //2nd for loop is for columns 
	{
		System.out.print("*");
		
	}
	System.out.println();
}
	//Program 2:
	/*1 
      1 2 
      1 2 3 
      1 2 3 4 
      1 2 3 4 5 
	   */
	System.out.println("Program 2:");
	for(int j=1;j<=5;j++) //1st for loop is for rows
	{
		for(int i=1;i<=j;i++) //2nd for loop is for columns
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
	}	
	//Program 3:
	/*1 
      2 3 
      4 5 6 
      7 8 9 10 
      11 12 13 14 15 
	 */
	System.out.println("Program 3:");
	int num=1;
	for(int j=1;j<=5;j++) //1st for loop is for rows
	{
		for(int i=1;i<=j;i++) //2nd for loop is for columns
		{
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}
	
System.out.println();
//Reverse 1:
//*****
//****
//***
//**
//*
System.out.println("Reverse Pro 1:");
	for(int j=1;j<=5;j++) //1st for loop is for rows
	{
		for(int i=5;i>=j;i--) //2nd for loop is for columns
		{
			System.out.print("*");
			}
		System.out.println();
	}
/* Reverse 2:
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
*/
System.out.println("Reverse Pro 2:");
	for(int j=1;j<=5;j++) //1st for loop is for rows
	{
		for(int i=5;i>=j;i--) //2nd for loop is for columns
		{
			System.out.print(i+" ");
			}
		System.out.println();
	}
/* Reverse 3:
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1  	
 */
System.out.println("Reverse Pro 3:");
	int num1=15;
	for(int j=1;j<=5;j++) //1st for loop is for rows
	{
		for(int i=5;i>=j;i--) //2nd for loop is for columns
		{
			System.out.print(num1+" ");
			num1--;
			}
		System.out.println();
	}
  /*1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5
	*/ 	
System.out.println();
for(int j=1;j<=4;j++) {
	for(int i=1;i<=5;i++) {
		System.out.print(i+" ");
	}
	System.out.println();
}

System.out.println();
System.out.println("2 to 10 Tables:");
for(int j=2;j<=10;j++) {
	for(int i=1;i<=10;i++) {
		System.out.print((j*i)+" ");
	}
	System.out.println();
}
}
}
