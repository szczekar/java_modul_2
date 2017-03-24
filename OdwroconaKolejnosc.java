package pl.moduldrugi_java;

import java.util.ArrayList;
import java.util.Scanner;

public class OdwroconaKolejnosc {

	public static void main(String[] args) {
		ArrayList<Integer> tabelka = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		int cyfra = 1;
		int liczba = 1;
		System.out.println("Wpisuje pozytywne liczby calkowite. Negatywna zakonczy wpisywanie: ");

		while (liczba > 0) {

			System.out.print("Cyfra " + cyfra + ": ");
			liczba = input.nextInt();
			tabelka.add(liczba);
			cyfra++;
		}

		// usuwamy ostatni ujemny element listy

		tabelka.remove(tabelka.size() - 1);

		// drukujemy liste od tylu

		System.out.print("Od tylu: ");
		for (int i = tabelka.size() - 1; i >= 0; i--) {
			int n = tabelka.get(i);
			System.out.print(n + " ");
		}
		input.close();
	}
}
