package Day7;

import java.util.Scanner;

public class Taking_Multiple_Input_From_Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num = SC.nextInt();
		System.out.println("Enter Second number:");
		int num1 = SC.nextInt();
		System.out.println("Addition of 2 number is:"+(num+num1));
	}

}
