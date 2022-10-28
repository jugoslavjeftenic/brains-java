package s169_upravljacke_strukture;

import alati.TextIO;

public class S187_SwitchSelekcija_String {

	public static void main(String[] args) {

		String units;
		double measurement = 1.0;

		units = TextIO.getlnString();

		switch (units) {
		case "inches":
			System.out.println(measurement);
			break;
		case "feet":
			System.out.println(measurement * 12);
			break;
		case "yards":
			System.out.println(measurement * 36);
			break;
		case "miles":
			System.out.println(measurement * 12 * 5280);
			break;
		default:
			System.out.println("Wait a minute! Illegal unit of measure! I quit!");
			System.exit(1);
		}
	}
}
