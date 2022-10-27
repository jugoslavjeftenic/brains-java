package s219_spisak_polaznika;

public class Osoba {

	private String ime, prezime, jmbg;
	
	public Osoba() {}
	
	public Osoba(String ime, String prezime, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
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

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	@Override
	public String toString() {
		return "Ime: " + ime + ", Prezime: " + prezime + ", jmbg " + jmbg;
	}
}
