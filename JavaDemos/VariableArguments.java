
public class VariableArguments {

	public static void main(String[] args) {

		String messsage = giveCity();
		System.out.println(messsage);
		int number = addition(15, 7);
		System.out.println(number);
		int addition = addition2(2, 3, 4, 5, 6, 10);
		System.out.println(addition);
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

	public static int addition2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static String giveCity() {
		return "Ankara";
	}

}
