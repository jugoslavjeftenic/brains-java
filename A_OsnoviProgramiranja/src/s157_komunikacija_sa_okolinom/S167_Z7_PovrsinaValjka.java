package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S167_Z7_PovrsinaValjka {

	public static void main(String[] args) {
		
		double r, h;
		
		System.out.print("Unesite polupreènik r: ");
		r = TextIO.getlnDouble();
		System.out.print("Unesite visinu H: ");
		h = TextIO.getlnDouble();
		System.out.println();

		double a = 2 * r * (r + h) * Math.PI;

		System.out.printf("Površina valjka polupreènika %.2f i visine %.2f je %.2f.", r, h, a);

	}

}
