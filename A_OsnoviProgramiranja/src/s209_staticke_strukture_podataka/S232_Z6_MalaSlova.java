package s209_staticke_strukture_podataka;

public class S232_Z6_MalaSlova {

	/*
	 * Dat je niz C od maksimalno 15 karaktera. Uèitati n karaktera u niz C i
	 * formirati niz A, pri èemu su elementi niza A samo mala slova iz niza C.
	 */
	
	public static void main(String[] args) {
		
		char[] a = new char[15], c = new char[15];
		for(int i = 0; i < c.length; i++)
			c[i] = (char) ((Math.random() * (90 - 65)) + 65);

		System.out.println("Niz sa velikim slovima je:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(c[i] + " ");
			a[i] = (char) (c[i] + 32);
		}

		System.out.println();
		System.out.println();

		System.out.println("Niz sa malim slovima je:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
