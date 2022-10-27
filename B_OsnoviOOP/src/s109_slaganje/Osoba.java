package s109_slaganje;

public class Osoba {

	/*
	 * Osmisliti, nacrtati dijagrame klasa i realizovati u Javi klase
	 * Institucija, Ucionica, Zaposleni (koja nasleðuje klasu Osoba) i Racunar koje
	 * bi se mogle koristiti u programu za evidenciju zaposlenih i inventara neke
	 * obrazovne institucije.
	 * Spiskove uèionica, zaposlenih i raèunara po uèionicama èuvati u
	 * odgovarajuæim nizovima (svaki sa najviše 20 èlanova).
	 * U kojim meðusobnim odnosima se nalaze pomenute klase
	 * (nasleðivanje, asocijacija, agregacija, kompozicija)?
	 * • Klase testirati kreiranjem objekata u glavnom programu i pozivanjem izabranih metoda.
	 *   Nacrtati UML dijagram klasa rešenja.
	 */
	
	protected String ime, prezime;
	protected int starost;
	
	public Osoba() {}

	public Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	public void predstaviSe() {
		System.out.printf("%s %s, star/a %d godina.", getIme(), getPrezime(), getStarost());
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}
}
