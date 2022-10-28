package s087_nasledjivanje_vozilo;

public class Kamion extends Vozilo {

	private int brojOsovina;
	
	public Kamion() {}

	public Kamion(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojOsovina) {
		super(marka, tip, registracija, godiste, vlasnik);
		this.brojOsovina = brojOsovina;
	}

	public void stampajPodatke() {
		System.out.printf("%s %s, god.proizvodnje [%d], registracija [%s], br.osovina [%d], vlasnik %s %s",
			getMarka(), getTip(), getGodiste(), getRegistracija(), getBrojOsovina(), vlasnik.getIme(), vlasnik.getPrezime());
	}
	
	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
}
