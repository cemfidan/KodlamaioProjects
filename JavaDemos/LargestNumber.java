
public class LargestNumber {

	public static void main(String[] args) {

		int number1 = 24;
		int number2 = 25;
		int number3 = 26;
		int largestNumber = number1;

		if (largestNumber < number2) {
			largestNumber = number2;
		}
		if (largestNumber < number3) {
			largestNumber = number3;
		}

		System.out.println("Largest number = " + largestNumber);

	}

}
