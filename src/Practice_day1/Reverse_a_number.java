package Practice_day1;

public class Reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1234;
for(int i=3;i>=0;i--)
{
	int digit = a%10;
	System.out.print(digit);
	a = a/10;
}
	}

}
