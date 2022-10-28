package s104_slaganje_vozilo;

class Vozilo {
	
	protected String marka, tip, registracija;
	protected int godiste;
	protected Motor motor;
	protected Osoba vlasnik;

	public Vozilo() {}
	
	public Vozilo(String marka, String tip, int godiste, String registracija, Motor motor, Osoba vlasnik) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.motor = motor;
		this.vlasnik = vlasnik;
	}
	
	public void promeniVlasnika(Osoba noviVlasnik) {
		this.vlasnik = noviVlasnik;
	}

	public void stampajPodatke() {
		System.out.println("Informacije o vozilu:");
		System.out.printf("\tMarka [%s],\n\tTip [%s],\n\tRegistracija [%s],\n\tGodiste [%d].\n", getMarka(), getTip(), getRegistracija(), getGodiste());
		motor.stampajPodatke();
		vlasnik.predstaviSe();
		System.out.println();
		System.out.println();
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}
}
