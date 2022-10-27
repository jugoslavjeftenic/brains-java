package s109_slaganje;

public class Ucionica {

	/*
	 * Osmisliti, nacrtati dijagrame klasa i realizovati u Javi klase
	 * Institucija, Ucionica, Zaposleni (koja nasleðuje klasu Osoba) i Racunar
	 * koje bi se mogle koristiti u programu za evidenciju zaposlenih i inventara neke obrazovne institucije.
	 * Spiskove uèionica, zaposlenih i raèunara po uèionicama èuvati u odgovarajuæim nizovima
	 * (svaki sa najviše 20 èlanova).
	 * 
	 * U kojim meðusobnim odnosima se nalaze pomenute klase (nasleðivanje, asocijacija, agregacija, kompozicija)?
	 * 
	 * Klase testirati kreiranjem objekata u glavnom programu i pozivanjem izabranih metoda.
	 * Nacrtati UML dijagram klasa rešenja.
	 */

	private int brojRacunara;
	
	public Ucionica() {}

	public Ucionica(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}

	public int getBrojRacunara() {
		return brojRacunara;
	}

	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}
}
