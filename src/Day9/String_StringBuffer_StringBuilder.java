package Day9;

public class String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String - immutable
		String s="WELCOME";
		s.concat(s);
		System.out.println(s);
		
		//StringBuffer - mutable
		StringBuffer s1=new StringBuffer("WELCOME");
		s1.append(" To JAVA");
		System.out.println(s1);
		
		//StringBuilder - mutable
		StringBuilder s2 =new StringBuilder("Welcome");
		s2.append(" To Java");
		System.out.println(s2);
		
	}

}
