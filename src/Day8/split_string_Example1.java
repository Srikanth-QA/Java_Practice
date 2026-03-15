package Day8;

public class split_string_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String amount = "$15, 20, 55";
System.out.println(amount.replace("$", " "));//remove $ symbol
System.out.println(amount.replace("$"," ").replace(","," ")); //remove , symbol

	}

}
