package Day13;

public class ThisKeyword {
int x,y; //class variable
ThisKeyword(int x, int y)
{
	this.x=x;
	this.y=y;
}
void setdata(int a, int b)
{
	x=a;
	y=b;
	
}
void display()
{
	System.out.println(x);
	System.out.println(y);
}
public static void main(String[] args)
{
	ThisKeyword th= new ThisKeyword(100,200);
	th.display();
	
	ThisKeyword th1= new ThisKeyword(300,400);
	th1.display();
}
}
