package pl.moduldrugi_java;

import java.util.Scanner;

public class OdTylu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Wpisz jakis text: ");
		String text = input.nextLine();

		StringBuilder builder = new StringBuilder();

		for (int i = text.length() - 1; i >= 0; i--) {

			char literka = text.charAt(i);
			builder.append(literka);

		}

		String ReversText = builder.toString();

		System.out.print("Od tylu: ");
		System.out.println(ReversText);
		input.close();

	}
}
