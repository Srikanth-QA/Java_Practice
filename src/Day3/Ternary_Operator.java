package Day3;

public class Ternary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//var=exp?result1:result2;
		int a=100, b=200;
		int x =(a<b)?a:b;
		System.out.println(x);
		
		//example 2
		int y=(1==1)?600:300;
		System.out.println(y);
		
		//example 3
		int person_age=30;
		String res=(person_age>=18)?"Eligible":"not Eligible";
		System.out.println(res);
		
		
	}

}
