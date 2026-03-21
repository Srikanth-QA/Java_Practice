package Day12;

public class overloading_Main_Method {

	public  void main(int x) {
		System.out.println(x);

	}
	void main(String s)
	{
		System.out.println(s);
	}
	void main(String s1, String s2)
	{
		System.out.println(s1+s2);
	}
	public static void main(String[] args)
	{
		overloading_Main_Method ov =new overloading_Main_Method();
		ov.main(100);
		ov.main("kanth");
		ov.main("hello", " kanth");
	}

}
