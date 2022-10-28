package s065_nasledjivanje_osoba;

public class Osoba {

	protected String ime, prezime;
	protected int starost;
	
	public Osoba() {}

	public Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
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

	public void predstaviSe() {
		System.out.printf
		("Ime: %s Prezime: %s Starost: %s god.\n", getIme(), getPrezime(), getStarost());
	}
}
