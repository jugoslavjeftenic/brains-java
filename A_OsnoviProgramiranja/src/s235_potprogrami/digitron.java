package s235_potprogrami;

import alati.TextIO;

public class digitron {

	public static void main(String[] args) {
		double operand1 = 0, operand2 = 0;
		double rezultat = 0;
		char izbor ='0';
		
		
		do {
			ispisiMeni();
			
			izbor = TextIO.getlnChar();
			
			if (izbor!='0') {
				operand1 = unosOperanda("Unesite prvi operand:");
				operand2 = unosOperanda("Unesite drugi operand:");
				System.out.println("--------------------------------------");

				switch (izbor) {
				case '1':
					rezultat = sabiranje(operand1, operand2);
					prikaziRezultatOperacije("\n%8.2f + %8.2f = %8.2f\n", operand1, operand2, rezultat);					
					break;
				case '2':
					rezultat = oduzimanje(operand1, operand2);
					prikaziRezultatOperacije("\n%8.2f - %8.2f = %8.2f\n", operand1, operand2, rezultat);
					break;
				case '3':
					rezultat = mnozenje(operand1,operand2);
					prikaziRezultatOperacije("\n%8.2f * %8.2f = %8.2f\n", operand1, operand2, rezultat);
					break;
				case '4':
					rezultat = deljenje(operand1, operand2);
					prikaziRezultatOperacije("\n%8.2f / %8.2f = %8.2f\n", operand1, operand2, rezultat);
				}
				System.out.println("--------------------------------------");
				
			}
		} while (izbor != '0');
		
	}
	static double unosOperanda(String poruka){
		double operand = 0.0;
		System.out.println(poruka);
		operand = TextIO.getlnDouble();
		return operand;
	}
	static double sabiranje(double op1, double op2){
		return op1 + op2;
	}
	static double oduzimanje(double op1, double op2){
		return op1 - op2;
	}
	static double mnozenje(double op1, double op2){
		return op1 * op2;
	}
	static double deljenje(double op1, double op2){
		return op1 / op2;
	}
	static void ispisiMeni() {
		System.out.println("--Program za simuliranje kalkulatora--");
		System.out.println("  Izaberite jednu od opcija->");
		System.out.println("  0. izlazak iz programa");
		System.out.println("  1. sabiranje");
		System.out.println("  2. oduzimanje");
		System.out.println("  3. množenje");
		System.out.println("  4. deljenje");
	}
	
	static void prikaziRezultatOperacije(String poruka, double operand1, double operand2, double rezultat) {
		System.out.printf(poruka, operand1, operand2, rezultat);
	}

}
