package s095_promenljive;

public class S110_Investicija {

	public static void main(String[] args) {
		
		/**************************************************************************************
		* Primer jednostavnog programa koji racuna zaradu na godisnjem nivou za investiciju od
		* 1000 dinara po godisnjoj kamatnoj stopi od 0.027. Ukupna zarada i vrednost investije
		* posle godinu dana se ispisuju u konzolu.
		***************************************************************************************
		
		/*
		 *  Deklaracija promenljivih
		 */
		double investicija;					// vrednost investicije
		double stopa;						// kamatana stopa
		double zarada;						// ukupna kamata po godini
		
		/* Izracunavanje */
		investicija = 1_000;
		stopa = 0.024;
		zarada = investicija * stopa;		// racunanje interesa
		investicija = investicija + zarada;
		
		/*
		 * Izracunavanje investicije posle godinu dana sa kamatom.
		 * (Obratiti paznju da nova vrednost investicije prepisuje staru.)
		 * Ispisivanje rezultata.
		 */
		System.out.println("Za godinu dana zaradjeno je: " + zarada + " dinara.");
		System.out.println("Ukupna vrednost investije je sada: " + investicija + " dinara.");

	}

}
