package s157_komunikacija_sa_okolinom;

import alati.TextIO;

public class S166_Investicija {
	
	public static void main(String[] args) {
		
		double investicija;						// vrednost investicije
		double stopa;							// kamatana stopa
		double zarada;							// ukupna kamata po godini
		
		System.out.print("Unesite vrednost investicije: ");
		investicija = TextIO.getlnDouble();
		
		System.out.print("Unesite vrednost kamatne stope: ");
		stopa = TextIO.getlnDouble();
		
		zarada = investicija * stopa;
		investicija += zarada;					// izracunavanje zarade
		
		System.out.println("Za godinu dana zaradjeno je: " + zarada + " dinara.");
		System.out.println("Ukupna vrednost investije je sada: " + investicija + " dinara.");
	}
}