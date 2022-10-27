package s109_slaganje_institucija;

class Zaposlenik extends Osoba {
	
	static int q = 100;
	private double qRM, plata;
	private int dani;
	
	public Zaposlenik() {}
	
	public Zaposlenik(String ime, String prezime, String jmbg, double qRM, int dani) {
		super(ime, prezime, jmbg);
		this.qRM = qRM;
		this.dani = dani;
		this.plata = racunajPlatu();
	}

	public double racunajPlatu() {
		return q * qRM * dani;
	}
	
	public void stampajPlatu() {
		System.out.printf("Zaposleni %s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.",
			 getIme(), getPrezime(), getqRM(), racunajPlatu());
	}

	public double getqRM() {
		return qRM;
	}

	public void setqRM(double qRM) {
		this.qRM = qRM;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public int getDani() {
		return dani;
	}

	public void setDani(int dani) {
		this.dani = dani;
	}
}
