package Java_Project_main;

public class Student_management_System_main {
	public void student1()
	{
		int id = 101;
		String name="Srikanth S S";
		int marks = 100;
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Marks = "+marks);
	} 
	
public void student2()
{
	int id = 201;
	String name="kantha";
	int marks = 35;
	System.out.println("ID = "+id);
	System.out.println("Name = "+name);
	System.out.println("Marks = "+marks);
}
public static void main(String[] agrs)
{
	Student_management_System_main stu = new Student_management_System_main();
	stu.student1();	
	stu.student2();	
}
}
