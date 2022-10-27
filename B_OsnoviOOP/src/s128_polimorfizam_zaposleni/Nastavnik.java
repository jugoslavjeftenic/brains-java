package s128_polimorfizam_zaposleni;

public class Nastavnik extends Zaposleni {
	
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
