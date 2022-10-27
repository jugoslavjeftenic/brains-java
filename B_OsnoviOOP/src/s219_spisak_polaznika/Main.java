package s219_spisak_polaznika;

public class Main {

	/*
	 * Napraviti program koji èitanjem iz ulaznog tekstualnog fajla spisak.txt
	 * prihvata podatke o polaznicima (ime, prezime, JMBG) i prikazuje ih na ekranu.
	 * Potom treba spisak polaznika sortirati po JMBG-u, ponovo ga prikazati na
	 * ekranu i na kraju ga upisati i u izlazni fajl uredjeniSpisak.txt
	 * 
	 * • Klase testirati u glavnom programu kreiranjem objekta sa spiskom polaznika
	 * i pozivanjem odgovarajuæih metoda
	 */
	
	public static void main(String[] args) {
		
		Spisak polaznici = new Spisak();
		
		polaznici.ucitajListu("src/s219_spisak_polaznika/spisak.txt");
		polaznici.stampajListu();
		polaznici.sortirajListu();
		polaznici.stampajListu();
		polaznici.upisiListu("src/s219_spisak_polaznika/uredjeniSpisak.txt");
	}
}
