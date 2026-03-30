package Practice_day1;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0, b=1;
for(int i=0; i<=9; i++)
{
	int c=a+b;
	System.out.println("Fibonacci series: "+c);
	a=b;
	b=c;
	
	
}
	}

}
