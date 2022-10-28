package s169_upravljacke_strukture;

import alati.TextIO;

public class S186_SwitchSelekcija_InicijalizacijaSpolja {

	public static void main(String[] args) {

		int status1;
		String potez1 = "nije pomerio";

		status1 = TextIO.getlnInt();
		switch (status1) {
		case 0:
			potez1 = "pomerio gore";
			break;
		case 1:
			potez1 = "pomerio dole";
			break;
		case 2:
			potez1 = "pomerio levo";
			break;
		case 3:
			potez1 = "pomerio desno";
		}
		System.out.println("Igrac se " + potez1);

		int status2;
		String potez2;
		status2 = TextIO.getlnInt();
		switch (status2) {
		case 0:
			potez2 = "pomerio gore";
			break;
		case 1:
			potez2 = "pomerio dole";
			break;
		case 2:
			potez2 = "pomerio levo";
			break;
		case 3:
			potez2 = "pomerio desno";
			break;
		default:
			potez2 = "nije pomerio";
		}
		System.out.println("Igrac se " + potez2);
	}
}
