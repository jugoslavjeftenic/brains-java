package s129_apstraktne_klase_i_interfejsi_restoran;

public abstract class Osoba {

	/*
	 * #ime:String
	 * #prezime:String
	 * #starost:int
	 * ---------------------
	 * +Osoba
	 * +predstaviSe:void
	*/
	
	protected String ime, prezime;
	protected int starost;
	
	public Osoba() {}

	public Osoba(String ime, String prezime, int starost) {
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
	}
	
	public abstract void predstaviSe();
	
	public String pribaviIme() {
		return ime;
	}

	public void postaviIme(String ime) {
		this.ime = ime;
	}

	public String pribaviPrezime() {
		return prezime;
	}

	public void postaviPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int pribaviStarost() {
		return starost;
	}

	public void postaviStarost(int starost) {
		this.starost = starost;
	}
}
