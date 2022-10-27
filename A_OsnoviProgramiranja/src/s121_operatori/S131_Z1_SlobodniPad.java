package s121_operatori;

public class S131_Z1_SlobodniPad {

	public static void main(String[] args) {
		
		/* Deklaracija */
		double gravitacija = -9.81;
		double inicijalnoUbrzanje = 0.0;
		double vremePadanja = 10.0;
		double inicijalnaPozicija = 0.0;
		double finalnaPozicija = .5 * gravitacija * vremePadanja * vremePadanja;
		
		/* Racunanje */
		finalnaPozicija = finalnaPozicija + inicijalnoUbrzanje * vremePadanja;
		finalnaPozicija = finalnaPozicija + inicijalnaPozicija;
		
		/* Ispisivanje */
		System.out.print("Pozicija objekta nakon " + vremePadanja + " sekundi je " + finalnaPozicija + "m.");

	}

}
