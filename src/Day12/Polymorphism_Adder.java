package Day12;

public class Polymorphism_Adder {
int a=10, b=30;
//Method names should be same -- method 1
void sum()
{
	System.out.println(a+b);
}
//no of param should be diff --method 2
void sum(int x, int y)
{
	System.out.println(x+y);
}
//data type of parameter should be different -- method 3
void sum(int x, double y)
{
	System.out.println(x+y);
}
//order of the param should be diff  -- method 4
void sum(double x, int y)
{
	System.out.println(x+y);
}
}
