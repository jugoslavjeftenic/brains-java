package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S167_Z1_TestiranjeOperanada {

	public static void main(String[] args) {

//		int a, b;
//		
//		System.out.print("Unesite vrednost operanda a: ");
//		a = TextIO.getlnInt();
//
//		System.out.print("Unesite vrednost operanda b: ");
//		b = TextIO.getlnInt();
//
//		System.out.println("Rezultat a + b: " + (a + b));
//		System.out.println("Rezultat a - b: " + (a - b));
//		System.out.println("Rezultat a * b: " + (a * b));
//		System.out.println("Rezultat a / b: " + (a / b));
//		System.out.println("Rezultat a % b: " + (a % b));
		
		double a, b;
		
		System.out.print("Unesite vrednost operanda a: ");
		a = TextIO.getlnDouble();
		System.out.print("Unesite vrednost operanda b: ");
		b = TextIO.getlnDouble();
		System.out.println();

		System.out.print("Rezultat a + b: ");
		System.out.printf("%7.2f", (a + b));
		System.out.println();

		System.out.print("Rezultat a - b: ");
		System.out.printf("%7.2f", (a - b));
		System.out.println();

		System.out.print("Rezultat a * b: ");
		System.out.printf("%.2f", (a * b));
		System.out.println();

		System.out.print("Rezultat a / b: ");
		System.out.printf("%.2f", (a / b));
		System.out.println();

		System.out.print("Rezultat a % b: ");
		System.out.printf("%.2f", (a % b));

	}

}
