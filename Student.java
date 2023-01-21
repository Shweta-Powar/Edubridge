package demopack;

public class Student {
int sid;
float marks;
String name;

Student()
{
	sid=01;
	marks=80.25f;
	name="Ram";
}

@Override
public String toString() {
	return "student [sid=" + sid + ", marks=" + marks + ", name=" + name + "]";
}

	
	
}
