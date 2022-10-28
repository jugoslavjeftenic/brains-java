package s049_kontrola_pristupa_i_enkapsulacija;

class Zaposleni {
	
	private String ime, prezime;
	private double qRM;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime, double qRM) {
		this.ime = ime;
		this.prezime = prezime;
		this.qRM = qRM;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public double getqRM() {
		return qRM;
	}

	public void setqRM(double qRM) {
		this.qRM = qRM;
	}

	public double racunajPlatu(int brojDana) {
		return qRM * 100 * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		System.out.printf
			("%s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.\n",
			 ime, prezime, qRM, racunajPlatu(brojDana));
	}
}

public class S062_Z2_Zaposleni {

	/*
	 * Realizovati prethodno implementirane klase (Student, Zaposleni, Racunar, Vozilo)
	 * tako da pruze dobru enkapsulaciju podataka kroz uvoðenje pristupnih atributa i
	 * realizaciju pristupnih metoda (za postavljanje i pribavljanje vrednosti) za svaki od atributa.
	 */
	
	public static void main(String[] args) {
		
		int brojRadnihDana = 30;
		
		Zaposleni z1 = new Zaposleni("Petar", "Petrovic", 2);
		Zaposleni z2 = new Zaposleni("Marko", "Kraljevic", 3);
		Zaposleni z3 = new Zaposleni("Marko", "Markovic", 4);

		z1.stampajPlatu(brojRadnihDana);
		z2.stampajPlatu(brojRadnihDana);
		z3.stampajPlatu(brojRadnihDana);
	}
}
