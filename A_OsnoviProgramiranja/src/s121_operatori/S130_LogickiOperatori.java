package s121_operatori;

public class S130_LogickiOperatori {

	public static void main(String[] args) {
		
		/* Deklaracija promenljivih. */
		boolean a = true, b = false;
		
		/* Negacija */
		System.out.println(" Negacija od True je: " + !a);
		System.out.println("Negacija od False je: " + !b);
		System.out.println();
		
		/* I operacija. */
		System.out.println("     True I False je: " + (a && b));
//		System.out.println("      True I True je: " + (a && a));
//		System.out.println("    False I False je: " + (b && b));
		System.out.println();
		
		/* ILI operacija. */
		System.out.println("   True ILI False je: " + (a || b));
//		System.out.println("    True ILI True je: " + (a || a));
//		System.out.println("  False ILI False je: " + (b || b));
		System.out.println();
		
		/* Eksluzivno ILI operacija. */
		System.out.println(" True EXILI False je: " + (a ^ b));
		System.out.println("  True EXILI True je: " + (a ^ a));
		System.out.println("False EXILI False je: " + (b ^ b));

	}

}
