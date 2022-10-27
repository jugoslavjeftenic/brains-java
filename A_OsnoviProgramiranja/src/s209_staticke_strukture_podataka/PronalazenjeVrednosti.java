package s209_staticke_strukture_podataka;

public class PronalazenjeVrednosti {

	public static void main(String[] args) {
		
		/*
		 * pronalaženje vrednosti koje zadovoljavaju neki složeni kriterijum 
		 * (npr. sve vrednosti manje od nekog broja a veæe od nekog drugog broja)
		 */
		 
		int[][] niz = new int[][] {{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0}};
		int min = 3, max = 6;
		int i = 0, j = 0;
		
		for (i = 0; i < niz[0].length; i++) {
			
			if (niz[0][i] >= min && niz[0][i] <= max) {
				niz[1][j] = i;
				j++;
			}
			
		}

		for (i = 0; i < j; i++)
			System.out.println("Pozicije trazenih vrednosti su: " + niz[1][i]);
	}

}
