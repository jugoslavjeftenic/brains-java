package s209_staticke_strukture_podataka;

import alati.TextIO;

public class S232_Z1_ParNepar {

	/*
	 * ZADATAK 1, strana232.
	 * Dat je niz X od maksimalno 12 celobrojnih elemenata. Uèitati n 
	 * elemenata u niz X i formirati nizove A i B, pri èemu su elementi niza A 
	 * parni elementi niza X, a elementi niza B su neparni elementi niza X. 
	 */
	
	/*
	 * REŠENJE ZADATKA.
	 * Zadatak je retroaktivno uraðen sa upotrebom matrica i podprograma.
	 * Umesto niza X, A i B je upotrebljena matrica X.
	 * Umesto da korisnik unosi vrednosti niza koristi se funkcija za nasumièno
	 * generisanje vrednosti elemenata.
	 */

	public static void main(String[] args) {
		
		// Deklarišemo matricu X sa 3 vrste i pozivamo potprogram "duzinaNiza"
		// za odreðivanje broja kolona matrice
		int[][] x = new int[3][duzinaNiza()];
		
		// Nakon dimenzionisanja matrice pozivamo potprogram za inicijalizaciju matrice.
		// Potprogramu prosleðujemo kompletnu matricu.
		popuniMatricu(x);
		
		// Pozivamo potprogram za izdvajanje parnih i neparnih vrednosti iz prethodno
		// popunjenog niza.
		// Potprogramu prosleðujemo kompletnu matricu X.
		// Potprogram referentno popunjava vrstu 1 i 2 matrice X sa odgovarajuæim vrednostima.
		// Potprogram vraæa celobrojni niz u koji upisuje najveæe indekse prve i druge vrste
		// koji sadrže korisnu vrednost.
		// (https://www.geeksforgeeks.org/returning-multiple-values-in-java/)
		int[] parNepar = izdvojiParNepar(x);
		
		// Poziva se potprogram za ispis rezultata.
		// Potprogramu se prosleðuje kompletna matrica X i
		// najveæi indeksi prve i druge vrste matrice X.
		ispisiMatricu(x, parNepar[0], parNepar[1]);
		
		// Pozivamo potprogram za ipis poruke o završetku programa.
		kraj();
	}
	
	// Potprogram (funkcija) koja korisnika pita koliko želi da mu bude dugaèak
	// niz brojeva i vraæa celobrojnu vrednost. Potprogram vrši proveru unosa vrednosti.
	static int duzinaNiza() {
		int duzina;
		System.out.println("Koliko celobrojnih vrednosti želite da mrRobot generiše (maks 12)?");
		System.out.println("(brojevi æe biti generisani u rasponu od -100 do 100)");
		do {
			duzina = TextIO.getlnInt();
			if (duzina < 1 || duzina > 12) {
				System.out.println("GREŠKA! Vrednost mora da bude u rasponu 1 - 12.");
			}
		} while (duzina < 1 || duzina > 12);
		return duzina;
	}
	
	// Potprogram (metoda) za popunu matrice.
	// U potprogram se iz roditeljske rutine prosleðuje dimenzionisana matrica.
	// Potprogram prilikom prolaska kroz svaki element poziva potprogram mrRobot
	// za nasumièno generisanje celih brojeva.
	// Potprogram nema povratnu vrednost nego referentno popunjava matricu.
	static void popuniMatricu(int matrica[][]) {
		for(int i = 0; i < matrica[0].length; i++) {
			matrica[0][i] = mrRobot(-100, 100);
		}
	}

	// Potprogram za nasumièno generisanje celih brojeva.
	// U potprogram se prosleðuju minimalna i maksimalna vrednost nasumiènog broja.
	// Potprogram vraæa generisanu vrednost.
	// (https://www.baeldung.com/java-generating-random-numbers-in-range)
	static int mrRobot(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
	
	// Potprogram referentno popunjava drugu i treæu vrstu matrice X sa filtriranim vrednostima.
	// Za filtriranje parnih i ne parnih vrednosti se koristi "Modulo operator" koji
	// proverava postojanje ostatka delenja celobrojne vrednosti sa 2.
	// (https://www.baeldung.com/modulo-java)
	// Potprogram vraæa niz u kojem æe se roditeljskoj rutini vratiti
	// najveæi indeksi prve i druge vrste matrice X koji sadrže korisnu vrednost.
	static int[] izdvojiParNepar(int matrica[][]) {
		int brojac[] = {0, 0};
		for (int i = 0; i < matrica[0].length; i++) {
			if (matrica[0][i] % 2 == 0) {
				matrica[1][brojac[0]] = matrica[0][i];
				brojac[0]++;
			}
			else {
				matrica[2][brojac[1]] = matrica[0][i];
				brojac[1]++;
			}
		}
		return brojac;
	}
	
	// Potprogram za ispis matrice.
	// Potprogram prihvata popunjenu matricu i najveæe indekse prve i druge vrste
	// matrice X koji sadrže korisnu vrednost.
	// Potprogram vrši ispis na konzolu i nema povratnu vrednost.
	static void ispisiMatricu(int matrica[][], int par, int nepar) {
		for (int i = 0; i < matrica.length; i++) {
			switch (i) {
			case 0:
				System.out.print("        Generisani niz je: ");
				for (int j = 0; j < matrica[i].length; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				break;
			case 1:
				System.out.print("  Parni brojevi u nizu su: ");
				for (int j = 0; j < par; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				break;
			case 2:
				System.out.print("Neparni brojevi u nizu su: ");
				for (int j = 0; j < nepar; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				break;
			}
			System.out.println();
		}
	}
	
	// Potprogram za ispis poruke o završetku programa.
	static void kraj() {
		System.out.println("--------------");
		System.out.println("KRAJ programa.");
	}
}
