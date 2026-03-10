package Day7;

import java.util.Arrays;

public class sorting_char_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[]={'A', 'C', 'B', 'E', 'D', 'F'};
		System.out.println("Before sorting.....");
		System.out.println(Arrays.toString(s)); //this case is used to print the array value instated of using for loop to print
		Arrays.sort(s);//sort element
		System.out.println("After sorting.....");
		System.out.println(Arrays.toString(s));
	}

}
