package s104_slaganje_vozilo;

public class Automobil extends Vozilo {
	
	private int brojVrata;
	
	public Automobil() {}

	public Automobil
	(String marka, String tip, int godiste, String registracija, Motor motor, Osoba vlasnik, int brojVrata) {
		super(marka, tip, godiste, registracija, motor, vlasnik);
		this.brojVrata = brojVrata;
	}
	
	public void stampajPodatke() {
		System.out.printf("Automobil sa %d vrata.\n", brojVrata);
		System.out.println("------------------------------");
		super.stampajPodatke();
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
}
