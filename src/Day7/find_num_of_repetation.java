package Day7;

public class find_num_of_repetation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,10,50,10};
		int num=10;
		int count=0;
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
