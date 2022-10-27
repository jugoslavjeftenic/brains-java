package s167_generisanje_i_obrada_izuzetaka;

public class s173_determinanta {

	public static void main(String[] args) {
		
		double[][] M = new double[][]{{1, 2}, {2, 3}};
//		double[][] M = new double[][]{{4}, {4}};
//		double[][] M = new double[][]{null, null};
		try {
			double determinanta = M[0][0] * M[1][1] - M[0][1] * M[1][0];
			
			System.out.println("Determinanta M je " + determinanta);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("M nije ispravne velicine!");
		}
		catch (NullPointerException e) {
			System.out.println("Programska greska! M ne postoji!");
		}
		System.out.println("Izuzetak je obradjen.");
	}
}
