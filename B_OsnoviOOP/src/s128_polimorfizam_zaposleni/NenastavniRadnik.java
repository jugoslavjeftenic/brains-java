package s128_polimorfizam_zaposleni;

public class NenastavniRadnik extends Zaposleni{

	private String radnoMesto;
	private int godineStaza;

	public NenastavniRadnik() {}

	public NenastavniRadnik(String ime, String prezime, String radnoMesto, int godineStaza) {
		super(ime, prezime, 0);
		this.radnoMesto = radnoMesto;
		this.godineStaza = godineStaza;
	}

	public void predstaviSe() {
		System.out.printf("%s %s, %s, godine radnog staza[%d], primanja %.2f.",
			super.getIme(), super.getPrezime(), radnoMesto, godineStaza, racunajPlatu());
	}
	
	public double racunajPlatu() {
		return 30000 + godineStaza * 500;
	}

	public String getRadnoMesto() {
		return radnoMesto;
	}

	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public int getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}
}
