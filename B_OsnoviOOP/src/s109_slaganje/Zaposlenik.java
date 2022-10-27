package s109_slaganje;

class Zaposlenik extends Osoba {
	
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
	
	protected double qRM;
	
	public Zaposlenik() {}
	
	public Zaposlenik(String ime, String prezime, double qRM) {
		super(ime, prezime, 0);
		this.qRM = qRM;
	}
	
	public double racunajPlatu(int brojDana) {
		return 100 * qRM * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		System.out.printf
			("%s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.",
			 ime, prezime, qRM, racunajPlatu(brojDana));
	}

	public double getqRM() {
		return qRM;
	}

	public void setqRM(double qRM) {
		this.qRM = qRM;
	}
}
