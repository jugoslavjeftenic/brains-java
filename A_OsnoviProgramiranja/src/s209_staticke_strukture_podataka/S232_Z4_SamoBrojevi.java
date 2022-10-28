package s209_staticke_strukture_podataka;

public class S232_Z4_SamoBrojevi {

	public static void main(String[] args) {
		
		/*
		 * Dat je niz C od maksimalno 15 karaktera. Uèitati n karaktera u niz C i
		 * formirati niz A, pri èemu su elementi niza A samo brojevi iz niza C.
		 */

		int indeks = 0;
		char[] a = new char[15], c = new char[15];
		for(int i = 0; i < c.length; i++)
			c[i] = (char) ((Math.random() * (122 - 48)) + 48);

		for (int i = 0; i < c.length; i++) {
			if (c[i] > 47 && c[i] < 58) {
				a[indeks] = c[i];
				indeks++;
			}
		}
		
		System.out.println("Generisani karakteri su:");
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i] + " ");
		System.out.println();
		
		indeks++;
		System.out.println("Brojevi izdvojeni iz generisanog niza su:");
		for(int i = 0; i < indeks; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
