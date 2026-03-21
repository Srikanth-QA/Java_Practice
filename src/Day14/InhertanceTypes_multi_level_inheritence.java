package Day14;
class D
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}
	class E extends D
	{
		int b=200;
		void show()
		{
			System.out.println(b);
		}
	}
	class F extends E
	{
		int c=300;
		void print()
		{
			System.out.println(c);
		}
	}
public class InhertanceTypes_multi_level_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F cobj=new F();
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
		cobj.display();
		cobj.show();
		cobj.print();
			}

}
