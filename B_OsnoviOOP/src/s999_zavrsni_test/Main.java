package s999_zavrsni_test;


public class Main {

	public static void main(String[] args) {

		/*
		 * (5 bd) Kolika æe biti vrednost promenljive x nakon izvrsavanja sledeceg Java programskog koda:
		 */
		int x = 8, y = 4;
		double z = 1;
		x /= y - z;
		System.out.println(x);
		
		/*
		 * (5 bd) Napisati kod koji implementira sledeci tekstualni algoritam:
		 * AKO JE (Y - 1) > Z, ONDA JE Y = X - 1, U SUPROTNOM, AKO JE 10 * Y < Z, ONDA JE Y = X + 1
		 */
		if ((y - 1) > z)
			y = x - 1;
		else if (10 * y < z)
			y = x + 1;
		
		/*
		 * (5 bd) Koliko puta ce se u narednom kodu prikazati slovo D:
		 */
		System.out.println("--------------------");
		x = 4;
		y = 2 * x + 3 * (x + 3);
		z = 1;
		for (int k = x; k <= y; k++) {
			if (k % 4 != 2)
				continue;
			System.out.println((int) z + ". D");
			z++;
		}
		
		/*
		 * (5 bd) U okviru kog paketa Java platforme se nalazi interfejs CookieStore?
		 * 
		 * https://www.geeksforgeeks.org/java-net-cookiestore-class-in-java/
		 * java.net.CookieStore
		 */
	}
}
