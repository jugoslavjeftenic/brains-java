package s209_staticke_strukture_podataka;

public class S232_Z2_ParNeparIndeksi {

	public static void main(String[] args) {
		
		/*
		 * Dat je niz X od maksimalno 10 realnih elemenata. Uèitati n elemenata u niz X
		 * i formirati nizove A i B, pri èemu su elementi niza A elementi niza X sa
		 * parnim indeksom, a elementi niza B su elementi niza X sa neparnim indeksom.
		 */
		
		int[][] x = new int[3][10];
		for (int i = 0; i < x[0].length; i++) {
			x[0][i] = i + 1;
		}

		int brojac[] = {0, 0};
		
		for (int i = 0; i < x[0].length; i++) {
			if (i % 2 == 0) {
				x[1][brojac[0]] = x[0][i];
				brojac[0]++;
			}
			else {
				x[2][brojac[1]] = x[0][i];
				brojac[1]++;
			}
		}
		
		for (int i = 0; i < x.length; i++) {

			switch (i) {
			case 0:
				System.out.print("                     Generisani niz je: ");
				for (int j = 0; j < x[i].length; j++) {
					System.out.print(x[i][j] + " ");
				}
				break;
			case 1:
				System.out.print("  Brojevi sa parnim indeksom u nizu su: ");
				for (int j = 0; j < brojac[0]; j++) {
					System.out.print(x[i][j] + " ");
				}
				break;
			case 2:
				System.out.print("Brojevi sa neparnim indeksom u nizu su: ");
				for (int j = 0; j < brojac[1]; j++) {
					System.out.print(x[i][j] + " ");
				}
				break;
			}
			
			System.out.println();
		}
	}
}
