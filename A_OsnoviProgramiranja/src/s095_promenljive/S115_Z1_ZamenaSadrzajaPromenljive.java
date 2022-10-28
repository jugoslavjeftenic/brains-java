package s095_promenljive;

public class S115_Z1_ZamenaSadrzajaPromenljive {

	public static void main(String[] args) {
		
		int a = 1, b = 5;
		int tmp = a;

		System.out.println("  Vrednosti pre zamene: A - " + a + ", B - " + b + ".");

		a = b;
		b = tmp;
		
		System.out.println("Vrednosti nakon zamene: A - " + a + ", B - " + b + ".");
	}
}
