package s104_slaganje_vozilo;

public class Motocikl extends Vozilo {

	private boolean registrovan;
	
	public Motocikl() {}

	public Motocikl
	(String marka, String tip, int godiste, String registracija, Motor motor, Osoba vlasnik, boolean registrovan) {
		super(marka, tip, godiste, registracija, motor, vlasnik);
		this.registrovan = registrovan;
	}

	public void stampajPodatke() {
		System.out.printf("Motocikl, %s.\n", (registrovan ? "registrovan" : "neregistrovan"));
		System.out.println("---------------------");
		super.stampajPodatke();
	}

	public boolean isRegistrovan() {
		return registrovan;
	}

	public void setRegistrovan(boolean registrovan) {
		this.registrovan = registrovan;
	}
}
