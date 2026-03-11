package Day8;

import java.util.Arrays;

public class Split_the_string_into_multiple_parts_based_on_delemiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="QA@gmail.com";
String a[]= s.split("@");
System.out.println(Arrays.toString(a));
System.out.println(a[0]);
System.out.println(a[1]);
	}

}
