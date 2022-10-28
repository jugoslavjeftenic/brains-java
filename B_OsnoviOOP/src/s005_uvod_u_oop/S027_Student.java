package s005_uvod_u_oop;

class Student {

	String ime, prezime;
	int poenT1, poenT2;
	
	void postaviImePrezime(String postaviIme, String postaviPrezime) {
		ime = postaviIme;
		prezime = postaviPrezime;
	}
	
	void postaviPoene(int prviPoen, int drugiPoen) {
		poenT1 = prviPoen;
		poenT2 = drugiPoen;
	}
	
	void pribaviProsek() {
		System.out.println("Prosek studenta " + ime + " " + prezime + " je: " + ((double) (poenT1 + poenT2) / 2));
	}
}

public class S027_Student {

	/*
	 * Kreirati klasu Student sa atributima ime, prezime, broj poena na testu 1 i testu 2,
	 * prosecan broj poena, kao i metodama za postavljanje imena i prezimena studenta,
	 * broja poena i racunanje prosecnog broja poena na testovima i stampanje uspeha studenata
	 * 
	 * Potom testirati klasu kreiranjem dva objekta u okviru glavnog programa,
	 * kojima postavljamo imena i prezimena i broj poena na testovima i za koje
	 * potom racunamo i prikazujemo uspeh.
	 */
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.postaviImePrezime("Jugoslav", "Jeftenic");
		student1.postaviPoene(2, 3);
		
		Student student2 = new Student();
		student2.postaviImePrezime("Marko", "Markovic");
		student2.postaviPoene(4, 5);
		
		student1.pribaviProsek();
		student2.pribaviProsek();
	}
}
