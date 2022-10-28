package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S167_Z6_Pritisak {

	public static void main(String[] args) {
		
		final double R = 8.314472;
		double v,  t;

		System.out.print("Unesite zapreminu V: ");
		v = TextIO.getlnDouble();
		System.out.print("Unesite temperaturu T: ");
		t = TextIO.getlnDouble();
		System.out.println();

		double p = 1.0 * R * t / v;
		
		System.out.printf("Pritisak idealnog gasa zapremine %.2f i temperature %.2f je %.2f Pa.", v, t, p);
	}
}
