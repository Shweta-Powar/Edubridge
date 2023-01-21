package departmentpackage;

public class ShapeObject {
private static int count; 
public ShapeObject() //No Argument Constructor 
{ 
 count++; // count variable increase by 1
} 
public static void main(String[] args) 
{
	ShapeObject circle = new ShapeObject();	
    ShapeObject square = new ShapeObject();
    ShapeObject rectangle = new ShapeObject();
    ShapeObject triangle = new ShapeObject();
    System.out.println("Number of Objects created: " + ShapeObject.count); 
}
}