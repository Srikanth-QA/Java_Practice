package Day13;

public class static_demo {
static int a=10;
int b=20;
static void m1()
{
	System.out.println("this is m1 static method...");
}
void m2()
{
	System.out.println("this is m2 non static method...");
}
public static void main(String[] args)
{
	System.out.println(a);
	m1();
	static_demo sd = new static_demo();
	System.out.println(sd.b);
	sd.m2();
	
}
}
