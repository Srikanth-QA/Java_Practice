package Day7;

import java.util.Arrays;

public class sorting_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={100, 300, 600, 400, 200, 500};
System.out.println("Before sorting.....");
System.out.println(Arrays.toString(a)); //this case is used to print the array value instated of using for loop to print
Arrays.sort(a);//sort element
System.out.println("After sorting.....");
System.out.println(Arrays.toString(a));


	}

}
