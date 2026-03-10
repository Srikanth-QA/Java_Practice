package Day6;

public class Read_all_row_and_col_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{100,200},{300, 400},{500,600}};
		for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]);
				
			}
		}
		System.out.println("done");
	}

}
