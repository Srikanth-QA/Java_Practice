package Day12;

public class Encapsulation_account_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation_account acc = new Encapsulation_account();
		acc.setAccno(101);
		acc.setName("kanth");
		acc.setAmount(100);
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}

}
