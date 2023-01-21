
import java.util.StringTokenizer;
import java.util.StringJoiner;
public class StringClass {
	public static void main(String[] args) {
		//Integer integer=300;//autoboxing
		String name="edubridge";//autoboxing
		name+="online classes";//New object creates
	name=name+"welcome";//new object
	
	//Mutable 
//	StringBuffer(thread safe) or StringBuilder(not thread safe)
	StringBuffer stringBuffer=new StringBuffer("welcome");
	System.out.println(stringBuffer);
	stringBuffer.append(" to java session");
	System.out.println(stringBuffer);
	stringBuffer.insert(10, " string ");
	System.out.println(stringBuffer);
	stringBuffer.delete(10, 16);
	System.out.println(stringBuffer);
	String str="hello,today session is java session";
	StringBuffer sb=new StringBuffer(str);
	int pos=sb.indexOf("session",13);
	System.out.println("Pos"+pos);
	System.out.println(sb.substring(6,23));
	
StringTokenizer st=new StringTokenizer("abc xyz pqr"," ");
while(st.hasMoreTokens())
{
	System.out.println(st.nextToken());
}
//java 8
StringJoiner stringJoiner = new StringJoiner("-","Start--->","--->end");
stringJoiner.add("java");
stringJoiner.add("springboot");
stringJoiner.add("c");
stringJoiner.add("c++");
stringJoiner.add("hibernate");
	
System.out.println(stringJoiner);
	
	}

}


