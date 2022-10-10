package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S167_Z5_OtpornostBakarnogProvodnika {

	public static void main(String[] args) {
		
		final double RCU = 1.588e-8;
		double i, d;

		System.out.print("Unesite dužinu provodnika I: ");
		i = TextIO.getlnDouble();
		System.out.print("Unesite unesite preènik provodnika d: ");
		d = TextIO.getlnDouble();
		System.out.println();

		double r = RCU * 4.0 * i / (d * d * Math.PI);

		System.out.printf("Otpornost bakarnog provodnika dužine %.2f i preènika %.2f je %f.", i, d, r);

	}

}
