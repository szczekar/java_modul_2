package pl.moduldrugi_java;

import java.util.Scanner;

public class PrawieNajwiekszy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Podaj ile liczb wpiszesz, a ja znajde prawie najwieszka: ");
		int ile_liczb = input.nextInt();

		int najwieksza = 0;
		int prawie_najwiek = 0;

		for (int i = 0; i < ile_liczb; i++) {

			System.out.println("Podaj liczbe nr: " + (i + 1));
			int liczba_biezaca = input.nextInt();

			if (liczba_biezaca > najwieksza) {
				prawie_najwiek = najwieksza;
				najwieksza = liczba_biezaca;

			} else if (liczba_biezaca > prawie_najwiek) {
				prawie_najwiek = liczba_biezaca;
			}
		}

		System.out.println("Prawie najwieksza cyfra to: " + prawie_najwiek);

		input.close();
	}

}
