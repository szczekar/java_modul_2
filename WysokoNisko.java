package pl.moduldrugi_java;

import java.util.Random;
import java.util.Scanner;

public class WysokoNisko {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Random losuj = new Random();
		int wylosowana = losuj.nextInt(100) + 1;

		System.out.println("Zgadnij liczbe pomiedzy 1 a 100. Masz 10 prob: ");
		int liczba_prob = 1;

		while (liczba_prob < 11) {

			System.out.println("Proba nr:" + liczba_prob);
			int liczba_uzytk = input.nextInt();
			
			if (liczba_prob == 10) {
				System.out.println("Wykonales " + liczba_prob + " prob. Niestety nie udalo Ci sie..Sprobuj ponownie :) ");
				break;
			}
			
			if (liczba_uzytk > wylosowana) {
				System.out.println("Wskazowka: nizej");
			} else if (liczba_uzytk < wylosowana) {
				System.out.println("Wskazowka: wyzej");
			} else {
				System.out.println("Prawidlowa odpowiedz !");
				break;
			}

			liczba_prob++;
		}
		
		input.close();
	}

}
