package s167_generisanje_i_obrada_izuzetaka;

public class S182_diskriminanta {
	
	/*
	 * Vraca veci od dva korena kvadratne jednacine A*x*x + B*x + C = 0, ako ona ima korena.
	 * Preduslovi: A != 0 i B*B – 4*A*C > 0
	 */
	
	public static void main(String[] args) {

		try {
			System.out.println(koren(0, 1, 2));
//			System.out.println(koren(1, 1, 2));
//			System.out.println(koren(1, 5, 2));
		}
		catch (IllegalArgumentException e) {
			return;
		}
	}
	
	static public double koren(double A, double B, double C) {
		assert A != 0 : "Vodeci koeficijent kvadratne jednacine ne sme biti nula!";

		double disk = B * B - 4 * A * C;
		assert disk >= 0 : "Diskriminanta kvadratne jednacine ne sme biti negativna!";
		return (-B + Math.sqrt(disk)) / (2 * A);
	}
}
