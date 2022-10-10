package s157_komunikacija_sa_okolinom;
import alati.TextIO;

public class S165_KvadratBroja {

	public static void main(String[] args) {
		
		int broj;			// broj koji treba da unese korisnik
		int kvadrat;		// uneti broj pomnozen samim sobom - kvadrat broja
		
		System.out.print("Unesite ceo broj: ");
		broj = TextIO.getlnInt();
		
		kvadrat = broj * broj;
		System.out.println();
		System.out.println("Broj koji ste uneli je " + broj);
		System.out.println("Kvadrat unetog broja je " + kvadrat);
		System.out.println();

	}

}
