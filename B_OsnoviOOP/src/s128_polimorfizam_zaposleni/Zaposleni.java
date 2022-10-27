package s128_polimorfizam_zaposleni;

class Zaposleni extends Osoba {
	
	protected double qRM;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime, double qRM) {
		super(ime, prezime, 0);
		this.qRM = qRM;
	}
	
	public double racunajPlatu(int brojDana) {
		return 100 * qRM * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		System.out.printf("%s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.",
			 ime, prezime, qRM, racunajPlatu(brojDana));
	}

	public double getqRM() {
		return qRM;
	}

	public void setqRM(double qRM) {
		this.qRM = qRM;
	}
}
