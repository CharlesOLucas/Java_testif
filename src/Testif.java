
public class Testif {

	public static void main(String[] args) {
		int balance = 10000;
		boolean withdraw;
		
		if (balance < 0)
			withdraw = false;
		else
			withdraw = true;
		
		System.out.println("I can withdraw: " + withdraw);

	}

}
