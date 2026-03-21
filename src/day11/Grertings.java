package day11;

public class Grertings {
// 1, no params --no returns
	void m1()
	{
		System.out.println("Hello.....");
	}
	
	//2. no params -- return value
	String m2()
	{
		return("Hello how are you");
	}
	// 3. with params -- without return values
	void m3 (String name)
	{
		System.out.println("hello" + name);
	}
	//with params -- with returm=ns value
	String m4(String name1)
	{
		return("Hello" +name1);
	}
}
