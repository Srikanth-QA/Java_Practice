package Day8;

import java.util.Arrays;

public class split_string_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abc,123@XYZ";
String arr[]=s.split(",");
System.out.println(Arrays.toString(arr));
String arr2[] = arr[1].split("@");
System.out.println(Arrays.toString(arr2));

System.out.println(arr[0]);
System.out.println(arr2[0]);
System.out.println(arr2[1]);


	}

}
