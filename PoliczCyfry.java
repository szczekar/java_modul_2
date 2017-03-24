package pl.moduldrugi_java;

import java.util.Scanner;

public class PoliczCyfry {

	public static void main(String[] args) {
		System.out.println("Wpisz liczbe pozytywna: ");
		Scanner input = new Scanner(System.in);

		String liczba = input.next();
		int cyfra = 0;
		int parzyste = 0;
		int nieparzyste = 0;
		int zera = 0;
		char znak = ' ';

		for (int i = 0; i < liczba.length(); i++) {
			znak = liczba.charAt(i);
			cyfra = Character.getNumericValue(znak);
			if (cyfra == 0) {
				zera++;
			} else if (cyfra % 2 == 0) {
				parzyste++;
			} else if (cyfra % 2 != 0) {
				nieparzyste++;
			}
		}

		System.out.println("Zera : " + zera + " Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste);

		input.close();
	}

}
