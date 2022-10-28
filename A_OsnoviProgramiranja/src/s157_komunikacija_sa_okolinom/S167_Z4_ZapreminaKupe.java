package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S167_Z4_ZapreminaKupe {

	public static void main(String[] args) {
		
		double r, h;
		
		System.out.print("Unesite poluprecnik r: ");
		r = TextIO.getlnDouble();
		System.out.print("Unesite visinu H: ");
		h = TextIO.getlnDouble();
		System.out.println();
		
		double v =  1.0 / 3 * r * r * h * Math.PI;
		
		System.out.printf("Zapremina kupe poluprecnika %.2f i visine %.2f iznosi %.2f", r, h, v);
	}
}
