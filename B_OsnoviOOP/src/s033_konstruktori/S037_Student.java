package s033_konstruktori;

class Student {

	/*
	 * Kreirati klasu Student sa atributima ime, prezime, broj poena na testu 1 i
	 * testu 2, proseèan broj poena, kao i metodama za postavljanje imena i
	 * prezimena studenta, broja poena i raèunanje proseènog broja poena na
	 * testovima i štampanje uspeha studenata
	 */
	
	String ime, prezime;
	int test1, test2;
	
	Student() {}
	
	Student(String ime1, String prezime1, int p1, int p2) {
		ime = ime1;
		prezime = prezime1;
		test1 = p1;
		test2 = p2;
	}
	
	String pribaviIme() {
		return ime;
	}

	String pribaviPrezime() {
		return prezime;
	}
	
	int racunajProsek() {
		return (test1 + test2) / 2;
	}
	
	void stampajProsek() {
		System.out.printf("Student %s %s - prosecan broj poena: %d.\n", pribaviIme(), pribaviPrezime(), racunajProsek());
	}
}

public class S037_Student {

	public static void main(String[] args) {
		/*
		 * Potom testirati klasu kreiranjem dva objekta u okviru glavnog programa,
		 * kojima postavljamo imena i prezimena i broj poena na testovima i za koje
		 * potom raèunamo i prikazujemo uspeh.
		 */

		Student prvi = new Student("Jugoslav", "Jeftenic", 2, 3);
		Student drugi = new Student("Marko", "Kraljevic", 5, 4);
		
		prvi.stampajProsek();
		drugi.stampajProsek();
	}
}