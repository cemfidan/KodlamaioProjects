
public class Letters {

	public static void main(String[] args) {

		char letter = 'E';

		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Bold vowel");
			break;
		default:
			System.out.println("Thin vowel");
			break;
		}

	}

}
