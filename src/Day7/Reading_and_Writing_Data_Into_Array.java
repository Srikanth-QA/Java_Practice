package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Reading_and_Writing_Data_Into_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
	System.out.println("Enter a value for position "+i+":" );
a[i] =sc.nextInt();

}
System.out.println("List of array: ");
System.out.println(Arrays.toString(a));
	}

}

//Assignment:
//1. Sorting element using for loop
//a= {50,20,30,50,200}

//2. Find mising in number ia array
//a={1,4,3,5}
//number should be in range
//should not have duplicate
