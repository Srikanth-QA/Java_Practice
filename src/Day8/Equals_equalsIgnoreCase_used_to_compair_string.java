package Day8;

public class Equals_equalsIgnoreCase_used_to_compair_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Welcome";
String s2="WELCOME";
String s3="Welcome";
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
	}

}
