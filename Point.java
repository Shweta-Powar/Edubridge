//To create user defined datatypes we have to create class.
import java.util.*;
class Point//user defined datatype
{
	//member variables or instance variables
	int x,y;
	//no arg constructor
	Point()
	{
	x=10;
	y=20;
	}
	//parameterized constructor
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	

/*public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//how  to create user defined datatype
		Point point1=new Point(); //10,20
		Point point2=new Point(100,200);
		Point point3=new Point(12,23);
		
		//UserDefinedatatype[] arrayname=new UserDefinedatatype[size];
		Point[] pointArray = new Point[3]; //Point();
		pointArray[0]=point1;
		pointArray[1]=point2;
		pointArray[2]=point3;
		
		System.out.println(pointArray[1].x +" "+pointArray[1].y); //100 200
		System.out.println(pointArray[0].x+" "+pointArray[0].y); //10 20
		System.out.println(pointArray[2]+" "+pointArray[2]); // This will only print address of referece vari- point3
} */
//Same as above prog by using for loop:
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	//datatype[] arrayname=new datatype[size];
	Point[] pointArray = new Point[3];//Point();
	for(int i=0;i<pointArray.length;i++)
	{
		pointArray[i]=new Point(); // it'll call no arg const.
	}
	for(int i=0;i<pointArray.length;i++)
	{
		System.out.println(pointArray[i].x+" "+pointArray[i].y +" "+pointArray[i]); // This'll display data in no aru const. 3 times.
	}
	//Read & Display data in parameterized const.
	for(int i=0;i<pointArray.length;i++)
	{
		System.out.println("enter the x and y value");
		pointArray[i]=new Point(scanner.nextInt(),scanner.nextInt()); // this'll call Parameterized const.
	}
	for(int i=0;i<pointArray.length;i++)
	{
		System.out.println(pointArray[i].x+" "+pointArray[i].y +" "+pointArray[i]);//display data in para const 3 times.
	}
	
}
	
}


