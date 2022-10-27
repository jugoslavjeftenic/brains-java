package s999_vezbe_1;

public class prvi_zadatak {

	public static void main(String[] args) {
		
		/*
		 * Kolika æe biti vrednost promenljive x nakon izvršavanja sledeæeg Java
		 * programskog koda (obrazložiti kako se izvršava deo koda sa operatorom /=):
		 * int x = 4; int y = 3; x /= y – 5;
		 * 
		 */
		// zadatak 1
//		int x = 4;
//		int y = 3;
//		
//		x /= (y - 5);
//		x = x / (y -5);
//		System.out.println(x);


		// zadatak 2
//		int a = 1, b = 2, c = 3;
//		if (a > 5) {
//			c = a + b;
//		}
//		else if (a < 0) {
//			c = a -b;
//		}
		
		// zadatak 3
		int a = 5;
		int b = 3 * a + a - 3;
		System.out.println(b);
		for (int i = a; i <= b; i++) {
			if (i % 2 !=0)
				continue;
			else {
				System.out.println("Q");
			}
		}
		
		// zadatak 4
//		Napisati kod za sortiranje niza celih brojeva osnovne taènosti.
		
		// zadatak 5
//		int[] niz = new int[]{12, 32, 51, 67, 89, 3, 22, 49, 73, -1, 0};
//		int p;
//		for (int i = 0; i < niz.length; i++) {
//			for (int y = i + 1; y < niz.length; y++) {
//				p = niz[i];
//				if (p > niz[y]) {
//					niz[i] = niz[y];
//					niz[y] = p;
//				}
//			}
//		}
//		
//		for (int i = 0; i < niz.length; i++) {
//			System.out.print(niz[i] + " ");
//		}
		
		// zadatak 7
		// Odgovor "java.util"
		
		// zadatak 8
		/*
		 * Napisati apstraktnu klasu Oblik koja ima atribute: boja (tipa String), tip
		 * (tipa String) i brojStrana (tipa int); metode za pribavljanje i postavljanje
		 * svih atributa (getere i setere), konstruktor kojim se postavljajuju vrednosti
		 * svih atributa i apstraktne metode za raèunanje površine i obima. Kod svih
		 * atributa i metoda navesti i odgovarajuæe pristupne atribute.
		 */
		
		
	}
}
