package s065_nasledjivanje_osoba;

public class Main {

	static int brojRadnihDana = 30, brojIndeksa = 0;

	public static void main(String[] args) {
		
		/*
		 * strana 70:
		 * Prethodne klase testirati kreiranjem dva objekta klase Zaposleni u glavnom
		 * programu. Potom odštampati podatke o zaposlenima i izraèunati i odštampati
		 * njihovu platu pozivom odgovarajuæih metoda.
		 */
		
		System.out.println("Zaposleni:");
		Zaposleni zaposleni[] = new Zaposleni[2];
		
		zaposleni[0] =  new Zaposleni(generisiIme(), generisiPrezime(), 25, 2000);
		zaposleni[1] =  new Zaposleni(generisiIme(), generisiPrezime(), 50, 1500);
		
		for (int i = 0; i < zaposleni.length; i++) {
			zaposleni[i].predstaviSe();
		}
		System.out.println();
		
		for (int i = 0; i < zaposleni.length; i++) {
			zaposleni[i].stampajPlatu(brojRadnihDana);
		}
		System.out.println();

		/*
		 * strana 80:
		 * Dodati i dva objekta klase Student u glavnom programu. Potom odštampati
		 * podatke i o studentima i izraèunati i odštampati proseèan broj poena koje su
		 * osvojili pozivom odgovarajuæih metoda.
		 */

		System.out.println("Studenti:");
		Student studenti[] = new Student[2];
		
		studenti[0] =  new Student(generisiIme(), generisiPrezime(), 25, ++brojIndeksa, 2, 3);
		studenti[1] =  new Student(generisiIme(), generisiPrezime(), 50, ++brojIndeksa, 4, 5);
		
		for (int i = 0; i < studenti.length; i++) {
			studenti[i].predstaviSe();
		}
		System.out.println();
		
		for (int i = 0; i < studenti.length; i++) {
			studenti[i].stampajProsek();
		}
		System.out.println();
		
		/*
		 * strana 86:
		 * Kreirati dva objekta klase Klijent u glavnom programu. Potom odštampati
		 * osnovne podatke o klijentima. Zatim izvršiti transfer sa raèuna jednog
		 * klijenta na raèun drugog klijenta. Prikazati stanja raèuna klijenata pre i
		 * posle transfera pozivom odgovarajuæih metoda.
		 */

		System.out.println("Klijenti:");
		Klijent klijenti[] = new Klijent[2];
		
		klijenti[0] =  new Klijent(generisiIme(), generisiPrezime(), 25, 10000);
		klijenti[1] =  new Klijent(generisiIme(), generisiPrezime(), 50, 15000);
		
		for (int i = 0; i < klijenti.length; i++) {
			klijenti[i].predstaviSe();
		}
		System.out.println();
		
		for (int i = 0; i < klijenti.length; i++) {
			klijenti[i].prikaziStanje();
		}
		System.out.println();

		System.out.printf
			("Sa racuna %s %s prebacujemo 1234 dukata na racun %s %s\n",
			 klijenti[0].getIme(), klijenti[0].getPrezime(),
			 klijenti[1].getIme(), klijenti[1].getPrezime());
		klijenti[0].prebaciNovac(klijenti[1], 1234);
		
		for (int i = 0; i < klijenti.length; i++) {
			klijenti[i].prikaziStanje();
		}
	}
	
	static String generisiIme() {
		String[] imena = {"Marko", "Petar", "Ivan", "Sreten", "Neven", "Mia", "Tea", "Lea", "Mila", "Una"};
		return imena[mrRobot(0, imena.length - 1)];
	}
	
	static String generisiPrezime() {
		String[] imena = {"Markovic", "Kraljevic", "Petrovic", "Ivanovic", "Sretenovic"};
		return imena[mrRobot(0, imena.length - 1)];
	}
	
	static int mrRobot(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
