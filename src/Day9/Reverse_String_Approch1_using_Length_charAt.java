package Day9;

public class Reverse_String_Approch1_using_Length_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="WELCOME";
String rev = " ";
for(int i=s.length()-1;i>=0;i--)
{
	rev = rev+s.charAt(i);
	
}
System.out.println("Reverse string is: "+rev);
	}

}
