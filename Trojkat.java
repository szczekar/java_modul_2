package pl.moduldrugi_java;

import java.util.Scanner;

public class Trojkat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int liczba = 2;

		while (liczba % 2 == 0) {
			System.out.print("Podaj liczbe nieparzysta: ");
			liczba = input.nextInt();
		}

		System.out.println("Trojkat prostokatny: ");

		char znak = '*';
		StringBuilder build = new StringBuilder();

		for (int i = 0; i < liczba; i++) {
			build.append(znak);
			String gwiazdki = build.toString();
			System.out.println(gwiazdki);
		}

		System.out.println("Trojkat rownoramienny: ");
		char znaczek = '*';
		int liczbaSpacji = liczba / 2;
		String spacja = " ";

		for (int j = 1; j <= liczba; j++) {

			if (!(j % 2 == 0)) {

				for (int i = 0; i < 1; i++) {
					for (int m = 0; m < liczbaSpacji; m++) {
						System.out.print(spacja);
					}
					for (int n = 0; n < j; n++) {
						System.out.print(znaczek);
					}

					System.out.println();
					liczbaSpacji--;

				}
			}
		}

		input.close();
	}
}
