package Day7;

public class Search_an_element_in_array_linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50,60};
boolean status = false;
int search_element = 300;
for (int i=0;i<a.length;i++)
{
	if(a[i]==search_element)
	{
		System.out.println("Element found");
		status = true;
		break;
	}
}
if(status==false)
{
	System.out.println("Element not fond");
}
	}

}
