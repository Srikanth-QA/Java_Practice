package Day12;

public class Polymorphism_main_adder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_Adder addobj =new Polymorphism_Adder();
			addobj.sum();//method 1
			addobj.sum(40, 30);//method 2
			addobj.sum(50, 90.8);//method 3
			addobj.sum(100.6, 10);//method 4
	}

}
