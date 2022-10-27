package s005_uvod_u_oop;

class Zaposleni {
	
	String ime, prezime;
	double qRM;
	
	void postaviNaziv(String strIme, String strPrezime, double dblQRM) {
		ime = strIme;
		prezime = strPrezime;
		qRM = dblQRM;
	}
	
	void pribaviNaziv() {
		System.out.print(ime + " " + prezime);
	}
	
	double pribaviPlatu() {
		return qRM * 2500;
	}
}

public class S031_Zaposleni {

	/*
	 * Kreirati klasu Zaposleni sa atributima ime (tipa String), prezime (tipa String) i
	 * koefRadnogMesta (tipa double), kao i metodama za postavljanje imena i prezimena zaposlenog i
	 * postavljanje koeficijenta radnog mesta, raèunanje plate po formuli:
	 * plata = 2500 * koefRadnogMesta i štampanje plate zaposlenog.
	 * 
	 * Potom testirati klasu kreiranjem tri objekta u okviru glavnog programa,
	 * kojima postavljamo imena i prezimena i koeficijente radnog mesta i
	 * za koje potom raèunamo i prikazujemo platu.
	 */
	
	public static void main(String[] args) {
		
		Zaposleni z1 = new Zaposleni();
		z1.postaviNaziv("Jugoslav", "Jeftenic", 2.5);
		
		z1.pribaviNaziv();
		System.out.println(" " + z1.pribaviPlatu());

		Zaposleni z2 = new Zaposleni();
		z2.postaviNaziv("Marko", "Markovic", 4.25);
		
		z2.pribaviNaziv();
		System.out.println(" " + z2.pribaviPlatu());

		Zaposleni z3 = new Zaposleni();
		z3.postaviNaziv("Petar", "Kraljevic", 3.75);
		
		z3.pribaviNaziv();
		System.out.println(" " + z3.pribaviPlatu());
	}
}
