
public class DoWhileLoop {

	public static void main(String[] args) {

		int j = 100;
		do {
			System.out.println("Logged");
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While loop is over");
	}

}
