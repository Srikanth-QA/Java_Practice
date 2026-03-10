package Day7;

public class Search_an_element_in_array_linear_search_enhance_for_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		boolean status = false;
		int search_element = 30;
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("element found");
				status =true;
				break;
				
			}
		}
		if(status==false)
		{
			System.out.println("element not found");
		}
	}

}
