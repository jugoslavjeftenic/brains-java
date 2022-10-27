package s260_banka;

public class Main {
	
	/*
	 * Program za podršku poslovanju banaka.
	 * Banke u svom poslovanju vode evidenciju o klijentima i realizovanim transakcijama.
	 * 
	 * Realizovati sledeæe funkcionalnosti:
	 * - Uèitavanje podataka o klijentima iz datoteke, kao i upis podataka o klijentima u datoteku.
	 * - Dodavanje, brisanje i traženje klijenta.
	 * - Realizacija internih transakcija izmeðu klijenata banke.
	 * - Upis podataka o svim transakcijama u datoteku.
	 * 
	 * U test klasi kreirati banku, uèitati podatke o klijentima i izvršiti transakcije.
	 * Podatke o izvršenim transakcijama upisati u datoteku.
	 * PROŠIRENJE 1: Dodati i funkcionalnosti za rad sa zaposlenima.
	 * PROŠIRENJE 2: Podržati realizaciju eksternih transakcija u platnom prometu prema
	 * klijentima iz drugih banaka.
	 */
	
	public static void main(String[] args) {
		
		String filePath = "src/s260_banka/";

		Banka b = new Banka();
		b.ucitajKlijente(filePath + "klijenti.txt");
		b.stampaKlijenata();
	}
}
