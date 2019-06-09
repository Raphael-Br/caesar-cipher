import java.util.Scanner;

public class Cipher {

	static Scanner ks = new Scanner(System.in);
	
	public void menu() {
		int again = 1;
		while (again == 1) {
			this.caesar();
			System.out.println("\nAgain?");
			System.out.println("[1] yes");
			System.out.println("[2] no");
			System.out.print(">>> ");
			again = ks.nextInt();
		}
		
		System.out.println("\nGood Bye");
	}
	
	public void caesar() {
		
		System.out.println("[1] Encrypt");
		System.out.println("[2] Decrypt");
		System.out.print(">>> ");
		int wahl = ks.nextInt();
		
		System.out.print("Text: ");
		ks.nextLine(); // whatever...
		String s = ks.nextLine();
		
		System.out.print("Move By: ");
		int moveBy = ks.nextInt();
		
		if (wahl == 1) {
			encrypt(s, moveBy);
		} else if (wahl == 2) {
			encrypt(s,(moveBy*(-1)));
		} else {
			System.out.println("ungültige Wahl");
		}
		
	}
	
	public void encrypt (String s, int moveBy) {
		String encrypted = "";
		int i = 0;
		while (i < s.length()) {
			char c = (char)(s.charAt(i) + moveBy);
			encrypted += c;
			i++;
		}
		System.out.println("\nResult: \n" + encrypted);
	}

}
