package s128_polimorfizam_zaposleni;

public class Osoba {

<<<<<<< HEAD
=======
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
	
>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git
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
