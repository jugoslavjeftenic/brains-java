package s095_promenljive;

public class S098_Promenljive {

	public static void main(String[] args) {
		
		int a = 3;
		int b;

		System.out.print("Vrednost promenljive a je: " + a + "\n\n");
		
		b = a + 12;
		System.out.print("Vrednost promenljive b = a + 12 je: " + b + "\n\n");

		a = a + 2;
		System.out.print("Vrednost promenljive a = a + 2 je: " + a + "\n\n");

		b = a + b;
		System.out.print("Vrednost promenljive b = a + b je: " + b);

	}

}
