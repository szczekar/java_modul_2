package pl.moduldrugi_java;

public class Client {

	public static void main(String[] args) {
		Person first = new Person("adam");
		Person second = new Person("lulok");
		Person third = new Person("zenek");

		System.out.println(first.imie);
		System.out.println(first.id);

		System.out.println(second.imie);
		System.out.println(second.id);

		System.out.println(third.imie);
		System.out.println(third.id);
	}

}

class Person {

	String imie;
	int id = 0;
	static int nextId = 0;

	Person(String imie) {
		this.imie = imie;

		nextId++;
		id = nextId;
	}

}
