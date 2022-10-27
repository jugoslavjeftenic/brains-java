package s033_konstruktori;

class StudentThis {

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

		StudentThis prvi = new StudentThis("Jugoslav", "Jeftenic", 2, 3);
		StudentThis drugi = new StudentThis("Marko", "Kraljevic", 5, 4);
		
		prvi.stampajProsek();
		drugi.stampajProsek();
	}
}