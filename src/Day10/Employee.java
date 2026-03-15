package Day10;

public class Employee {
	//variables
			int eid;
			String ename;
			String job;
			int salary;
	 void display ()
	{
		//Method
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(salary);
	}
public static void main(String[] args)
{
	Employee emp1=new Employee();
	emp1.eid=101;
	emp1.ename="Srikanth";
	emp1.job="QA";
	emp1.salary=3000000;
	emp1.display();
	
}
}
