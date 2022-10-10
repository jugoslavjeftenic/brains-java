package s095_promenljive;

public class S115_Z1__PomeranjeSadrzajaPromenljiveUlevo {

	public static void main(String[] args) {
		
		int a = 1, b = 2, c = 3;
		int tmp = a;
		
		System.out.println("  Vrednosti pre pomeranja: A - " + a + ", B - " + b + ", C - " + c + ".");

		a = b;
		b = c;
		c = tmp;
		
		System.out.println("Vrednosti nakon pomeranja: A - " + a + ", B - " + b + ", C - " + c + ".");

	}

}
