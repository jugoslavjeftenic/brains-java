package s065_nasledjivanje_osoba;

public class Zaposleni extends Osoba {

	private double qRM, plata;
	
	public Zaposleni() {}

	public Zaposleni(String ime, String prezime, int starost, double qRM) {
		super(ime, prezime, starost);
		this.qRM = qRM;
	}
	
	public double getQRM() {
		return qRM;
	}

	public void setQRM(double qRM) {
		this.qRM = qRM;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

	public void racunajPlatu(int brojDana) {
		plata = getQRM() * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		racunajPlatu(brojDana);
		System.out.printf("Zaposleni %s %s, na radnom mestu sa koeficijentom %.2f ima platu %.2f\n",
			getIme(), getPrezime(), getQRM(), getPlata());
	}
}
