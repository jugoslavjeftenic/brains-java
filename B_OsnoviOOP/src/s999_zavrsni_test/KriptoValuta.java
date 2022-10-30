package s999_zavrsni_test;

public class KriptoValuta {
	
	private Osoba vlasnik;
	private double kolicina;
	private String valuta;
	
	public KriptoValuta(Osoba vlasnik, double kolicina, String valuta) {
		this.vlasnik = vlasnik;
		this.kolicina = kolicina;
		this.valuta = valuta;
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}

	public double getKolicina() {
		return kolicina;
	}

	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}
}
