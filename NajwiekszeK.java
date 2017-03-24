package pl.moduldrugi_java;

import java.util.Scanner;

public class NajwiekszeK {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Wpisz dowolna pozytywna liczbe: ");
		int liczba = input.nextInt();

		int K = 0;
		int suma = 0;

		while (suma < liczba) {

			K += 2;
			suma += K;

		}

		K = K - 2;

		System.out.println("Najwieksze K to: " + K);
		input.close();
	}
}
