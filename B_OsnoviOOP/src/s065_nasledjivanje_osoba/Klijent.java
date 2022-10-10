package s065_nasledjivanje_osoba;

public class Klijent extends Osoba {

	private double racunStanje;
	
	public Klijent() {}

	public Klijent(String ime, String prezime, int starost, double racunStanje) {
		super(ime, prezime, starost);
		this.racunStanje = racunStanje;
	}
	
	public double getRacunStanje() {
		return racunStanje;
	}

	public void setRacunStanje(double racunStanje) {
		this.racunStanje = racunStanje;
	}

	public void prikaziStanje() {
		System.out.printf("Klijent %s %s ima na racunu %.2f dukata.\n",
			getIme(), getPrezime(), getRacunStanje());
	}
	
	public void prebaciNovac(Klijent klijent, double suma) {
		this.racunStanje -= suma;
		klijent.racunStanje += suma;
	}
	
	public void primiNovac(Klijent klijent, double suma) {
		this.racunStanje += suma;
		klijent.racunStanje -= suma;
	}
}
