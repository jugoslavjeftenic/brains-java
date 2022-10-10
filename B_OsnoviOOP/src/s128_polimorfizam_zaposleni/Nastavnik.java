package s128_polimorfizam_zaposleni;

public class Nastavnik extends Zaposleni {
	
	/*
	 * Realizovati klase Nastavnik, Asistent i NenastavniRadnik, izvedene nasleðivanjem iz klase Zaposleni.
	 * 
	 * Klasa Nastavnik ima dodatne atribute zvanje (tipa String) i brojSCIRadova (tipa int)
	 * Klasa Asistent ima dodatne atribute mentor (tipa String) i godinaDoktorskihStudija (tipa int)
	 * Klasa NenastavniRadnik ima dodatne atribute radnoMesto (tipa String) i godineStaza (tipa int).
	 * 
	 * Za svaku od klasa realizovati metodu predstaviSe i racunajPlatu uzimajuæi u obzir
	 * specifiène atributa za svaku od klasa.
	 * 
	 * Napomena: platu za nastavnike raèunati kao 60000 + brojSCIRadova * 3000,
	 * kod asistenata kao 40000 + godinaDoktorskihStudija * 2000,
	 * a kod nenastavnih radnika kao 30000 + godineStaza * 500.
	 * 
	 * • Klase testirati kreiranjem više objekata u glavnom programu i
	 * pozivanjem metoda za predstavljanje i raèunanje plate.
	 */
	
	private String zvanje;
	private int brojSCIRadova;

	public Nastavnik() {}
	
	public Nastavnik(String ime, String prezime, String zvanje, int brojSCIRadova) {
		super(ime, prezime, 0);
		this.zvanje = zvanje;
		this.brojSCIRadova = brojSCIRadova;
	}
	
	public void predstaviSe() {
		System.out.printf("%s %s, %s, broj naucnih radova[%d], primanja %.2f.",
				super.getIme(), super.getPrezime(), zvanje, brojSCIRadova, racunajPlatu());
	}
	
	public double racunajPlatu() {
		return 60000 + brojSCIRadova * 3000;
	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public int getBrojSCIRadova() {
		return brojSCIRadova;
	}

	public void setBrojSCIRadova(int brojSCIRadova) {
		this.brojSCIRadova = brojSCIRadova;
	}
}
