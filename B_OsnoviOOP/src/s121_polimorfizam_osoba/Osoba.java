package s121_polimorfizam_osoba;

public class Osoba {

<<<<<<< HEAD
=======
	/*
	 * Realizovati klasu Zena, izvedenu iz klase Osoba, koja ima i atribut
	 * devojackoPrezime. Objekti klase Zena treba da odgovaraju na poruku
	 * predstaviSe, ali dame skoro nikada ne otkrivaju svoje godine. Zato objekat
	 * klase Zena treba da ima funkciju predstaviSe, samo što æe ona izgledati nešto
	 * drugaèije, svojstveno izvedenoj klasi Zena – bez saopštavanja podataka o
	 * starosti, ali sa devojaèkim prezimenom.
	 * 
	 * • Klase testirati kreiranjem više objekata u glavnom programu i pozivanjem metoda za predstavljanje.
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
