package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S167_Z3_SlobodniPad {

	public static void main(String[] args) {
		
		final double GRAVITACIJA = -9.81;
		double inicijalnoUbrzanje = 0.0;
		double vremePadanja = 10.0;
		double inicijalnaPozicija = 0.0;

		System.out.print("Unesite inicijalno ubrzanje: ");
		inicijalnoUbrzanje = TextIO.getlnDouble();
		System.out.print("Unesite vreme padanja: ");
		vremePadanja = TextIO.getlnDouble();
		System.out.print("Unesite inicijalnu poziciju: ");
		inicijalnaPozicija = TextIO.getlnDouble();
		System.out.println();

		double finalnaPozicija = 0.5 * GRAVITACIJA * vremePadanja * vremePadanja;
		
		finalnaPozicija = finalnaPozicija + inicijalnoUbrzanje * vremePadanja;
		finalnaPozicija = finalnaPozicija + inicijalnaPozicija;
		
		System.out.printf("Pozicija objekta nakon %.2f sekundi je %.2fm.", vremePadanja, finalnaPozicija);

	}

}
