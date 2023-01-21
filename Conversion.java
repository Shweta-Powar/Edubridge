
public class Conversion {
	public static void main(String[] args) {
		
		//converts the primitive type 100 to object type--boxing
			Integer integer=Integer.valueOf(100);
			System.out.println(integer);
			Integer integer1=500;//autoboxing 
			
			int num2=integer1;//auto-de-boxing -object to primitive
			int num3 =integer1.intValue();
			
			System.out.println(Integer.MAX_VALUE +" "+Integer.MIN_VALUE );
			System.out.println(Integer.BYTES);
			
			//int value to byte value
			byte bvalue=integer1.byteValue();
			System.out.println("bytevalue"+bvalue);
					
			//int to double
			double dvalue=integer1.doubleValue();
			System.out.println("doublevalue"+dvalue);
			
			//"1234" to int
			int strtoint=Integer.parseInt("1234");
			
			//string to boolean type
			boolean boolvalue=Boolean.parseBoolean("true");
			
			//primitive to object
			//object to primitive
			//convertion of different datatypes
			
			//valueOf()--primitive to object
			//parseDouble()--String object --double primitive
			
			long lvalue=987652;
			Long lobject=Long.valueOf(lvalue);
			long llvalue=lobject.longValue();
			
			
			short svalue=23;
			Short sobject=Short.valueOf(svalue);//p to o
			short ssvalue=sobject.shortValue();//o to p
			
			//short to int value
			int snvalue=sobject.intValue();
			System.out.println("Short-int="+svalue);
			
			int value=Integer.max(456, 78);
			System.out.println("Max="+value);
			
		//System.out.println(Integer.parseInt("Edubridge"));//"97398"
			
			double d=Double.parseDouble("67.89");
			System.out.println(d);
			
		
	}
}
