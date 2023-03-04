
public class SwitchBlock {

	public static void main(String[] args) {

		char grade = 'H';

		switch (grade) {
		case 'A':
			System.out.println("Excellent : You passed");
			break;
		case 'B':
		case 'C':
			System.out.println("Good : You passed");
			break;
		case 'D':
			System.out.println("Not bad : You passed");
			break;
		case 'F':
			System.out.println("Unfortunately you did not pass");
			break;
		default:
			System.out.println("Invalid number");
		}

	}

}
