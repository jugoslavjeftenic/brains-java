package s104_slaganje_vozilo;

public class Kamion extends Vozilo {

	private int brojOsovina;
	
	public Kamion() {}

	public Kamion
	(String marka, String tip, int godiste, String registracija, Motor motor, Osoba vlasnik, int brojOsovina) {
		super(marka, tip, godiste, registracija, motor, vlasnik);
		this.brojOsovina = brojOsovina;
	}

	public void stampajPodatke() {
		System.out.printf("Kamion sa %d osovine.\n", brojOsovina);
		System.out.println("---------------------");
		super.stampajPodatke();
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
}
