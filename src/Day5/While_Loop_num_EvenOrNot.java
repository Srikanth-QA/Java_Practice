package Day5;

public class While_Loop_num_EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i + " num is even");
			} else {
				System.out.println(i + " num is odd");
			}
			i++;
		}
	}
}
