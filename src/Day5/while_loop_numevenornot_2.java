package Day5;

public class while_loop_numevenornot_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		while (i >= 1) {
			if (i % 2 == 0) {
				System.out.println(i + " num is even");
			} else {
				System.out.println(i + " num is odd");
			}
			i--;
		}
	}
}

