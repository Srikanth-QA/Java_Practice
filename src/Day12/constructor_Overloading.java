package Day12;

public class constructor_Overloading {
	double width, height, depth;
	constructor_Overloading()
	{
		width= height= depth=0;
	}
	constructor_Overloading(double w, double h, double d)
	{
		width=w;
		height= h;
		depth=d;
	}
	constructor_Overloading(double len)
	{
		width= height= depth=len;
	}
	double volume()
	{
		return(width* height* depth);
	}
}
