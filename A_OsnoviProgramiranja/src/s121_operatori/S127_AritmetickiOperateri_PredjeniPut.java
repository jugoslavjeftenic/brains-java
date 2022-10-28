package s121_operatori;

public class S127_AritmetickiOperateri_PredjeniPut {

	public static void main(String[] args) {
		
		/* Deklaracija promenljivih i izracunavanje */
		double ubrzanje = 2.0;
		double pocetnaBrzina = 3.0;
		double vreme = 10.0;
		
		double predjeniPut = 0.5 * ubrzanje * vreme * vreme;
		predjeniPut = predjeniPut + pocetnaBrzina * vreme;
		
		/* Ispisivanje rezultata. */
		System.out.print("Predjeni put nakon " + vreme + " sekundi je " + predjeniPut + "m.");
	}
}
