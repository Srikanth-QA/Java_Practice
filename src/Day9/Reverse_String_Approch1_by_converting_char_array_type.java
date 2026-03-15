package Day9;

public class Reverse_String_Approch1_by_converting_char_array_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="WELCOME";
		String rev = " ";
		char a[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+a[i];
			
		}
		System.out.println("Reverse string is: "+rev);
			}

		}
