package s167_generisanje_i_obrada_izuzetaka;

public class s179_diskriminanta {

	/*
	 * Vraca veci od dva korena kvadratne jednacine A*x*x + B*x + C = 0, ako ona ima korena.
	 * Ako je A==0 ili je diskriminanta B*B - 4*A*C negativna onda se generise izuzetak tipa IllegalArgumentException.
	 */
	
	public static void main(String[] args) {

		try {
//			System.out.println(koren(0, 1, 2));
			System.out.println(koren(1, 1, 2));
			System.out.println(koren(1, 5, 2));
		}
		catch (IllegalArgumentException e) {
			System.out.println(e);
			return;
		}
	}
	
	static public double koren(double A, double B, double C) throws IllegalArgumentException {
		if (A == 0) {
			throw new IllegalArgumentException("A ne moze biti nula!");
		}
		else {
			double disk = B * B - 4 * A * C;
			if (disk < 0)
				throw new IllegalArgumentException("Diskriminanta manja od nule!");
			return (-B + Math.sqrt(disk)) / (2 * A);	
		}
	}
}
