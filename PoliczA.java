package pl.moduldrugi_java;

import java.util.Scanner;

public class PoliczA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Wpisz jakis tekst: ");
		String text = input.nextLine();

		int a = 0;
		int A = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a') {
				a++;
			}
			if (text.charAt(i) == 'A') {
				A++;
			}

		}

		System.out.println("Ilosc a: " + a);
		System.out.println("Ilosc A: " + A);

		input.close();
	}

}
