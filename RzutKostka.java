package pl.moduldrugi_java;

import java.util.Random;

public class RzutKostka {

	public static void main(String[] args) {
		int[] tabela = new int[6]; // tabela z 6 elementami reprezentujacymi
									// sciany kostki
		Random generator = new Random();

		for (int i = 0; i < 6000; i++) {
			int wylosowana = generator.nextInt(6) + 1;

			switch (wylosowana) {

			case 1:
				tabela[0]++;
				break;
			case 2:
				tabela[1]++;
				break;
			case 3:
				tabela[2]++;
				break;
			case 4:
				tabela[3]++;
				break;
			case 5:
				tabela[4]++;
				break;
			case 6:
				tabela[5]++;
				break;
			}
		}
		System.out.println("Wynik po tym jak rzucilismy kostka 6000 razy :");
		for (int i = 0; i < 6; i++) {
			System.out.println(i + 1 + ": " + tabela[i]);
		}

	}
}
