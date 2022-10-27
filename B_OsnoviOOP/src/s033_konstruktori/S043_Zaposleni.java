package s033_konstruktori;

class Zaposleni {
	
	String ime, prezime;
	double qRM, plata;
	
	Zaposleni() {}
	
	Zaposleni(String ime, String prezime, double qRM) {
		this.ime = ime;
		this.prezime = prezime;
		this.qRM = qRM;
	}
	
	void racunajPlatu(int brojDana) {
		plata = qRM * 100 * brojDana;
	}
	
	void stampajPlatu(int brojDana) {
		racunajPlatu(brojDana);
		System.out.printf("%s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.\n", ime, prezime, qRM, plata);
	}
}

public class S043_Zaposleni {

	public static void main(String[] args) {
		
		int brojRadnihDana = 30;
		
		Zaposleni z1 = new Zaposleni("Jugoslav", "Jeftenic", 2);
		Zaposleni z2 = new Zaposleni("Marko", "Kraljevic", 3);
		Zaposleni z3 = new Zaposleni("Marko", "Markovic", 4);

		z1.stampajPlatu(brojRadnihDana);
		z2.stampajPlatu(brojRadnihDana);
		z3.stampajPlatu(brojRadnihDana);
	}
}
