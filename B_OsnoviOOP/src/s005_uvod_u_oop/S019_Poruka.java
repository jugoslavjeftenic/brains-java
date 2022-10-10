package s005_uvod_u_oop;

class Poruka {

	/*
	 * Potrebno je kreirati klasu Poruka sa atributom tekst i
	 * metodama postaviTeksti pribaviTekst
	 */
	
	String tekst;
	
	void postaviTekst (String noviTekst) {
		tekst = noviTekst;
	}
	
	void pribaviTekst () {
		System.out.println(tekst);
	}
}

public class S019_Poruka {

	public static void main(String[] args) {
		/*
		 * Potom testiramo našu klasu kreiranjem objekta klase (tipa) Poruka u okviru
		 * glavnog programa, praæenog postavljanjem i prikazivanjem njenog sadržaja
		 */
		
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
