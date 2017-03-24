package pl.moduldrugi_java;

public class ZamienMiejsca {
	public static void main(String[] args) {
		char[] text = { 'e', 'w', 't', 'a', '³', ' ', 'a', 'z', ' ', 'o', '³', 'y', 'b', ' ', 'o', 'T' };

		// PRINT THE TABLE

		for (char c : text) {
			System.out.print(c);
		}
		// REVERSE TABLE

		int size = text.length;
		for (int i = 0; i < size / 2; i++) {
			int n = size - i - 1;
			char temp = text[i];
			text[i] = text[n];
			text[n] = temp;

		}

		// PRINT THE REVERSE TABLE
		System.out.println();
		for (char c : text) {
			System.out.print(c);
		}
	}
}
