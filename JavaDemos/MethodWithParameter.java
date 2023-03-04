
public class MethodWithParameter {

	public static void main(String[] args) {

		String messsage = giveCity();
		System.out.println(messsage);
		int number = addition(5, 7);
		System.out.println(number);
	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static String giveCity() {
		return "Ankara";
	}

}
