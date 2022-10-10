package s109_slaganje;

public class Institucija {
	
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
	
	private int brojUcionica, brojZaposlenih;
	private Ucionica[] ucionice = new Ucionica[brojUcionica];
	private Zaposlenik[] zaposleni = new Zaposlenik[brojZaposlenih];
	
	public Institucija() {}
	
	public Institucija(int brojUcionica, int brojZaposlenih) {
		this.brojUcionica = brojUcionica;
		this.brojZaposlenih = brojZaposlenih;
	}

	public Institucija(int brojUcionica, int brojZaposlenih, Ucionica[] ucionice, Zaposlenik[] zaposleni) {
		this.brojUcionica = brojUcionica;
		this.brojZaposlenih = brojZaposlenih;
		this.ucionice = ucionice;
		this.zaposleni = zaposleni;
	}

	public int getBrojUcionica() {
		return brojUcionica;
	}

	public void setBrojUcionica(int brojUcionica) {
		this.brojUcionica = brojUcionica;
	}

	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}

	public Ucionica[] getUcionice() {
		return ucionice;
	}

	public void setUcionice(Ucionica[] ucionice) {
		this.ucionice = ucionice;
	}

	public Zaposlenik[] getZaposleni() {
		return zaposleni;
	}

	public void setZaposleni(Zaposlenik[] zaposleni) {
		this.zaposleni = zaposleni;
	}
}
