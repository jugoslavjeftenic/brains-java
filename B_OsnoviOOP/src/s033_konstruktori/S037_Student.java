package s033_konstruktori;

class Student {

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
		System.out.printf("Student %s %s - prosecan broj poena: %d.\n",
			pribaviIme(), pribaviPrezime(), racunajProsek());
	}
}

public class S037_Student {

	public static void main(String[] args) {

		Student prvi = new Student("Jugoslav", "Jeftenic", 2, 3);
		Student drugi = new Student("Marko", "Kraljevic", 5, 4);
		
		prvi.stampajProsek();
		drugi.stampajProsek();
	}
}