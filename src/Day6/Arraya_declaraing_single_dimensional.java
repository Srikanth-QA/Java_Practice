package Day6;

public class Arraya_declaraing_single_dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Approach 1
		int a[]=new int [5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//find the length of array
		System.out.println(a.length);
		
		//read single value
		System.out.println(a[4]);
		
		//normal loop
		for(int i=0; i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}

}
