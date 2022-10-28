package s005_uvod_u_oop;

class Poruka {

	String tekst;
	
	void postaviTekst (String noviTekst) {
		tekst = noviTekst;
	}
	
	void pribaviTekst () {
		System.out.println(tekst);
	}
}

public class S019_Poruka {

	/*
	 * Potrebno je kreirati klasu Poruka sa atributom tekst i metodama postaviTeksti pribaviTekst
	 * 
	 * Potom testiramo nasu klasu kreiranjem objekta klase (tipa) Poruka u okviru glavnog programa,
	 * pracenog postavljanjem i prikazivanjem njenog sadrzaja
	 */
	
	public static void main(String[] args) {
		
		Poruka prvaPoruka = new Poruka();
		
		prvaPoruka.tekst = "Zdravo Radovane!";
		prvaPoruka.pribaviTekst();

		prvaPoruka.postaviTekst("Zdravo svete!");
		prvaPoruka.pribaviTekst();
		
		Poruka p1 = new Poruka();
		Poruka p2 = new Poruka();

		Poruka p3 = null;
		
		p2 = prvaPoruka;
		p2.pribaviTekst();
		
		prvaPoruka.postaviTekst("A vi kako ste?");
		
		p2.pribaviTekst();
		
		p1.postaviTekst("Negledam kosarku");
		
		p1 = p3;
	}
}
