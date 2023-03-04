
public class Methods {

	public static void main(String[] args) {

		findingNumber();

		giveMessage("message");

	}

	public static void findingNumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findingNumber = 5;
		boolean isExist = false;

		for (int number : numbers) {
			if (number == findingNumber) {
				isExist = true;
				break;
			}
		}

		if (isExist) {
			System.out.println("The number is available");
		} else {
			System.out.println("The number is not available");
		}

	}

	public static void giveMessage(String message) {
		System.out.println(message);
	}

}
