
public class Strings2 {

	public static void main(String[] args) {

		String message = "The weather is very nice today.";

		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);

		System.out.println(message.substring(4, 11));

		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());

		System.out.println(message.trim());

	}

}
