package s209_staticke_strukture_podataka;

import alati.TextIO;

public class S230_SrednjaVrednostMatrice_Resenje {

	public static void main(String[] args) {
		
		final int MAXVRSTA = 10;
		final int MAXKOLONA = 20;
		int Nvr = 1, Nkol = 1, i, j;
		float srvr = 0;
		int[][] MatricaPrirordnihBrojeva = new int[MAXVRSTA][MAXKOLONA];
		
		System.out.println("Program za racunanje srednje vrednosti elemenata matrice prirodnih brojeva.\n\n");
		System.out.println("Unesite broj vrsta:\t");
		Nvr = TextIO.getlnInt();
		
		System.out.println("\nUnesite broj kolona:\t");
		Nkol = TextIO.getlnInt();
		
		for (i = 0; i < Nvr; i++)
			for (j = 0; j < Nkol; j++){
				System.out.println("Unesite element matrice na koordinati [" + (i+1) + "][" + (j+1) + "]:\t");
				MatricaPrirordnihBrojeva[i][j] = TextIO.getlnInt();
			}
		
		for (i = 0; i < Nvr; i++)
			for (j = 0; j < Nkol; j++)
				srvr += MatricaPrirordnihBrojeva[i][j];
				srvr /= (Nvr*Nkol);

		System.out.println(" Srednja vrednost elemenata matrice iznosi " + srvr +".");
	}
}
