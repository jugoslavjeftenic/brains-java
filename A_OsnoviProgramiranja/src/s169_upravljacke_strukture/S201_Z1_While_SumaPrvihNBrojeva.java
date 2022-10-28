package s169_upravljacke_strukture;

import alati.TextIO;

public class S201_Z1_While_SumaPrvihNBrojeva {

	public static void main(String[] args) {
		
		int N = 1;
		int i, suma = 0;
		
		System.out.println("Program za racunanje sume prvih N prirodnih brojeva.");
		System.out.println("Unesite N: ");
		
		do {
			N = TextIO.getlnInt();
			if (N < 1) {
				System.out.println("N mora biti veci od 0. Unesite ponovo N: ");
			}
		} while (N < 1);

		i = 1;
		while (i <= N) {
			System.out.printf("%d(s) + %d(i)\n", suma, i);
			suma += i;
			i++;
		}
		
		System.out.println("Suma prvih " + N + " prirodnih brojeva je: " + suma + ".");
	}
}
