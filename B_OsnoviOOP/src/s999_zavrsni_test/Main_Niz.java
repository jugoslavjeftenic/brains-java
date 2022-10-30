package s999_zavrsni_test;

public class Main_Niz {

	/*
	 * (10 bd) Napisati Java kod za deljenje niza celih brojeva na 2 podniza.
	 * U jedan podniz idu sve vrednosti iz prvog niza cija je vrednost manja od kolicnika vrednosti prvog i
	 * poslednjeg elementa originalnog niza, dok u drugi podniz idu sve preostale vrednosti.
	 * Na kraju, potrebno je ispisati sadrzaje oba podniza.
	 */
	
	/*
	 * (10 bd) Nacrtati blok dijagram algoritma za prethodni zadatak
	 */
	
	public static void main(String[] args) {
		
		int[] niz = new int[10];
		System.out.print("Originalni niz: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * (10 - 1)) + 1;
			System.out.print(niz[i] + " ");
		}

		int[] podniz1 = new int[niz.length];
		int[] podniz2 = new int[niz.length];
		int idx1 = 0, idx2 = 0;
		int kolicnik = niz[0] * niz[niz.length - 1];
		
		System.out.println();
		System.out.println("Kolicnik: " + kolicnik);
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < kolicnik) {
				podniz1[idx1] = niz[i];
				idx1++;
			}
			else {
				podniz2[idx2] = niz[i];
				idx2++;
			}
		}
		
		System.out.println();
		System.out.println("Podniz 1 cije su vrednosti manje od kolicnika:");
		for (int element : podniz1)
			System.out.print(element + " ");
		
		System.out.println();
		System.out.println("Podniz 2 sa ostalim vrednostima:");
		for (int element : podniz2)
			System.out.print(element + " ");
	}
}
