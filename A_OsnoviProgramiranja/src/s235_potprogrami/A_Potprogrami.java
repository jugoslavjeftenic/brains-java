package s235_potprogrami;

import alati.TextIO;

public class A_Potprogrami {

	public static void main(String[] args) {
		
		/*
		 * Implementirati program koji raèuna sumu, razliku,
		 * proizvod i koliènik dva broja. Brojeve zadaje korisnik
		 * preko tastature. Implementirati unos, sabiranje,
		 * oduzimanje, množenje, deljenje i prikaz rezultata kao
		 * zasebne potprograme.
		 */
		int a, b;
		int operacija;
		
		do {
//			do {
//				System.out.println("Da li zelite da generisem A i B (y/n):");
//				TextIO.getlnBoolean();
//			} while (true);
			
			System.out.println("Upisite A:");
			a = TextIO.getlnInt();

			System.out.println("Upisite B:");
			b = TextIO.getlnInt();
			
			System.out.println("Izaberite operaciju (+ - * /):");
			System.out.println("1 - saberi");
			System.out.println("2 - oduzmi");
			System.out.println("3 - pomnozi");
			System.out.println("4 - podeli");
			System.out.println("0 - izlaz");
			operacija = TextIO.getlnInt();
			
			switch (operacija) {
				case 0:
					System.out.println("KRAJ");
					System.exit(0);
				case 1:
					System.out.println("Rezultat sabiranja je: " + saberi(a, b));
					break;
				case 2:
					System.out.println("Rezultat oduzimanja je: " + oduzmi(a, b));
					break;
				case 3:
					System.out.println("Rezultat mnozenja je: " + pomnozi(a, b));
					break;
				case 4:
					System.out.println("Rezultat deljenja je: " + podeli(a, b));
					break;
			}
			
			System.out.println("--------------------------");
				
			
		} while (true);
		
	}

	private static int saberi(int a, int b) {
		return a + b;
	}
	private static int oduzmi(int a, int b) {
		return a - b;
	}
	private static double pomnozi(int a, int b) {
		return a * b;
	}
	private static double podeli(int a, int b) {
		return a / b;
	}


}
