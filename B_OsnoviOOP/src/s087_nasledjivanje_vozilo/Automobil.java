package s087_nasledjivanje_vozilo;

public class Automobil extends Vozilo {

	private int brojVrata;
	
	public Automobil() {}

	public Automobil(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojVrata) {
		super(marka, tip, registracija, godiste, vlasnik);
		this.brojVrata = brojVrata;
	}

	public void stampajPodatke() {
		System.out.printf("%s %s, god.proizvodnje [%d], registracija [%s], br.vrata [%d], vlasnik %s %s",
			getMarka(), getTip(), getGodiste(), getRegistracija(), getBrojVrata(), vlasnik.getIme(), vlasnik.getPrezime());
	}
	
	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
}
