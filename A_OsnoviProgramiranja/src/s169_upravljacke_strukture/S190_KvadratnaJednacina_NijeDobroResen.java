package s169_upravljacke_strukture;

import alati.TextIO;

public class S190_KvadratnaJednacina_NijeDobroResen {

	public static void main(String[] args) {
		
        double a, b, c;
        double x1, x2;

        System.out.println("Unesite parametar jednaèine A: ");
		a = TextIO.getlnDouble();
		System.out.println("Unesite parametar jednaèine B: ");
		b = TextIO.getlnDouble();
		System.out.println("Unesite parametar jednaèine C: ");
		c = TextIO.getlnDouble();
		System.out.println();

		if ((b * b) < (4 * a * c)) {
			System.out.println("Rešenje je kompleksno.");
		}
        else if (a == 0 && b == 0 && c == 0)
            System.out.println("Rešenje je svako x iz skupa realnih brojeva.");
        else if (a == 0) {
            x1 = -1 * (c / b);
            System.out.printf("Rešenje je linearno i iznosi: %f", x1);
        }
        else {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.printf("Rešenje je: X1=%f, X2=%f", x1, x2);
        }

	}

}
