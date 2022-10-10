package s033_konstruktori;

class StudentThis {

	/*
	 * Kreirati klasu Student sa atributima ime, prezime, broj poena na testu 1 i
	 * testu 2, proseèan broj poena, kao i metodama za postavljanje imena i
	 * prezimena studenta, broja poena i raèunanje proseènog broja poena na
	 * testovima i štampanje uspeha studenata
	 */
	
	String ime, prezime;
	int test1, test2;
	
	StudentThis() {}
	
	StudentThis(String ime, String prezime, int test1, int test2) {
		this.ime = ime;
		this.prezime = prezime;
		this.test1 = test1;
		this.test2 = test2;
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

public class S041_Student_this {

	public static void main(String[] args) {
		/*
		 * Potom testirati klasu kreiranjem dva objekta u okviru glavnog programa,
		 * kojima postavljamo imena i prezimena i broj poena na testovima i za koje
		 * potom raèunamo i prikazujemo uspeh.
		 */

		StudentThis prvi = new StudentThis("Jugoslav", "Jeftenic", 2, 3);
		StudentThis drugi = new StudentThis("Marko", "Kraljevic", 5, 4);
		
		prvi.stampajProsek();
		drugi.stampajProsek();
	}
}