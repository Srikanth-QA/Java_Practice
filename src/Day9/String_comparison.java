package Day9;

public class String_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//case 1
		String s1="WELCOME";
		String s2 = "WELCOME";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//case 2
		String s3 = new String ("Selenium");
		String s4 = new String ("Selenium");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);//to compare the object
		System.out.println(s3.equals(s4));// to compare the object value
		
		//case 3
		String s5= "srikanth";
		String s6 = new String ("srikanth");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		//case 4
				String s7= "ABC";
				String s8 = new String ("ABC");
			String	s9=s8;
				System.out.println(s7==s8);
				System.out.println(s7.equals(s8));
	}

}
