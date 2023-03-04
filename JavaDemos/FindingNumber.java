
public class FindingNumber {

	public static void main(String[] args) {

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

}
