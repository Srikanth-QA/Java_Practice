package Day7;

import java.util.Scanner;

public class Taking_Input_From_Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner SC = new Scanner(System.in);
System.out.println("Enter  the number:");
int num = SC.nextInt();
System.out.println("Entered number is:"+num);

System.out.println("Enter the ecimal number:");
double num1=SC.nextDouble();
System.out.println("Entered value is "+num1);

System.out.println("Enter your city:");
String city=SC.next();
System.out.println("Entered city is:"+city);
	}

}
