package s087_nasledjivanje_vozilo;

public class Motocikl extends Vozilo {

	private boolean registrovan;
	
	public Motocikl() {}

	public Motocikl(String marka, String tip, String registracija, int godiste, Osoba vlasnik, boolean registrovan) {
		super(marka, tip, registracija, godiste, vlasnik);
		this.registrovan = registrovan;
	}

	public void stampajPodatke() {
		System.out.printf("%s %s, god.proizvodnje [%d], registracija [%s], %s, vlasnik %s %s",
			getMarka(), getTip(), getGodiste(), getRegistracija(),
			(isRegistrovan()) ? "registrovan" : "nije registrovan",	vlasnik.getIme(), vlasnik.getPrezime());
	}
	
	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
}
