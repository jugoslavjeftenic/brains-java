package s033_konstruktori;

class Zaposleni {
	
	/*
	 * Zadatak: Realizovati klasu Zaposleni sa atributima ime, prezime,
	 * koefRadnogMesta, plata, standardnim konstruktorom i konstruktorom koji
	 * postavlja inicijalne vrednosti atributa, metodom za raèunanje plate na osnovu
	 * broja radnih dana u mesecu i radnog mesta, kao i metodom za štampanje
	 * podataka o zaposlenom i njegovoj plati
	 * Formula za raèunanje plate: plata = koefRadnogMesta * brojRadnihDana * 100
	 */
	
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
		

		/*
		 * Potom testirati klasu kreiranjem tri objekta u okviru glavnog programa,
		 * za koje izraèunavamo platu i potom prikazujemo podatke o zaposlenima i njihovim platama
		 */
		
		int brojRadnihDana = 30;
		
		Zaposleni z1 = new Zaposleni("Jugoslav", "Jeftenic", 2);
		Zaposleni z2 = new Zaposleni("Marko", "Kraljevic", 3);
		Zaposleni z3 = new Zaposleni("Marko", "Markovic", 4);

		z1.stampajPlatu(brojRadnihDana);
		z2.stampajPlatu(brojRadnihDana);
		z3.stampajPlatu(brojRadnihDana);
	}
}
