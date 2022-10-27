package s121_polimorfizam_osoba;

public class Zena extends Osoba {
	
	private String devojackoPrezime;
	
	public Zena() {}

	public Zena(String ime, String prezime, int starost, String devojackoPrezime) {
		super(ime, prezime, starost);
		this.devojackoPrezime = devojackoPrezime;
	}

	public void predstaviSe() {
		System.out.printf("%s, %s, %s", getIme(), getDevojackoPrezime(), getPrezime());
	}

	public String getDevojackoPrezime() {
		return devojackoPrezime;
	}

	public void setDevojackoPrezime(String devojackoPrezime) {
		this.devojackoPrezime = devojackoPrezime;
	}
}
