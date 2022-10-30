package s235_potprogrami;

import alati.TextIO;

public class S252_Z2_Kalkulator_prosiren {

	/*
	 * Implementirati program koji raèuna sumu, razliku, proizvod i koliènik dva
	 * broja. Brojeve zadaje korisnik preko tastature. Implementirati unos,
	 * sabiranje, oduzimanje, množenje, deljenje i prikaz rezultata kao zasebne
	 * potprograme.
	 */

	/*
	 * Izmeniti prethodni program tako da korisnik može da bira željenu operaciju
	 * (sabiranje, oduzimanje, množenje ili deljenje), pri èemu za svaku operaciju
	 * ponovo definiše operande. Omoguæiti ponavljanje ovih operacija sve dok
	 * korisnik ne odluèi da izaðe iz programa.
	 */

	public static void main(String[] args) {

		double operand1 = 0, operand2 = 0;
		double zbir = 0, razlika = 0, proizvod = 0, kolicnik = 0;
		String operacija = "0";
		boolean status = false;

		System.out.println("--Program za simuliranje kalkulatora--");

		do {
			System.out.println("Unesi operaciju koju zelis da izvrsim nad operandima malim slovima: ");

			if (!(operacija.equals("0")))
				operacija = TextIO.getlnString();

			do {
				operacija = TextIO.getlnString();

				if (!(operacija.equals("sabiranje") || operacija.equals("oduzimanje") || operacija.equals("mnozenje")
						|| operacija.equals("deljenje"))) {
					System.out.println("Pogresan unos. Ocekivani unos: sabiranje, oduzimanje, mnozenje, ili deljenje");
				}
			} while (!(operacija.equals("sabiranje") || operacija.equals("oduzimanje") || operacija.equals("mnozenje")
					|| operacija.equals("deljenje")));

			switch (operacija) {
			case "sabiranje":
				operand1 = unosOperanda("Unesite prvi operand:");
				operand2 = unosOperanda("Unesite drugi operand:");
				zbir = sabiranje(operand1, operand2);
				prikaziRezultate(operand1, operand2, zbir, "sabiranje");
				break;
			case "oduzimanje":
				operand1 = unosOperanda("Unesite prvi operand:");
				operand2 = unosOperanda("Unesite drugi operand:");
				razlika = oduzimanje(operand1, operand2);
				prikaziRezultate(operand1, operand2, razlika, "oduzimanje");
				break;
			case "mnozenje":
				operand1 = unosOperanda("Unesite prvi operand:");
				operand2 = unosOperanda("Unesite drugi operand:");
				proizvod = mnozenje(operand1, operand2);
				prikaziRezultate(operand1, operand2, proizvod, "mnozenje");
				break;
			case "deljenje":
				operand1 = unosOperanda("Unesite prvi operand:");
				operand2 = unosOperanda("Unesite drugi operand:");
				kolicnik = deljenje(operand1, operand2);
				prikaziRezultate(operand1, operand2, kolicnik, "deljenje");
				break;
			default:
				System.out.println("pogresan unos");
			}
			System.out.println("Da li zelis i dalje da koristis kalkulator? Odgovori sa true ili false");
			status = TextIO.getBoolean();
		} while (status);
		System.out.println("KRAJ PROGRAMA");
	}

	static double unosOperanda(String poruka) {
		double operand = 0.0;
		System.out.println(poruka);
		operand = TextIO.getlnDouble();
		return operand;
	}

	static double sabiranje(double op1, double op2) {
		return op1 + op2;
	}

	static double oduzimanje(double op1, double op2) {
		return op1 - op2;
	}

	static double mnozenje(double op1, double op2) {
		return op1 * op2;
	}

	static double deljenje(double op1, double op2) {
		return op1 / op2;
	}

	static void prikaziRezultate(double op1, double op2, double zb, String operacija) {
		System.out.println("\n---Rezultat " + operacija + " je:---");
		if (operacija == "sabiranje") {
			System.out.printf("\n%8.2f + %8.2f = %8.2f\n", op1, op2, zb);
			System.out.println("--------------------------------------");
		} else if (operacija == "oduzimanje") {
			System.out.printf("\n%8.2f - %8.2f = %8.2f\n", op1, op2, zb);
			System.out.println("--------------------------------------");
		} else if (operacija == "mnozenje") {
			System.out.printf("\n%8.2f * %8.2f = %8.2f\n", op1, op2, zb);
			System.out.println("--------------------------------------");
		} else if (operacija == "deljenje") {
			System.out.printf("\n%8.2f / %8.2f = %8.2f\n", op1, op2, zb);
			System.out.println("--------------------------------------");
		}
	}
}
