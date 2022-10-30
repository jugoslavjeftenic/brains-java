package s157_komunikacija_sa_okolinom;

import alati.TextIO;

public class S167_Z2_PredjeniPut {

	public static void main(String[] args) {
		
		double ubrzanje, pocetnaBrzina, vreme;

		System.out.print("Unesite ubrzanje: ");
		ubrzanje = TextIO.getlnDouble();
		System.out.print("Unesite pocetnu brzinu: ");
		pocetnaBrzina = TextIO.getlnDouble();
		System.out.print("Unesite vreme: ");
		vreme = TextIO.getlnDouble();
		System.out.println();

		double predjeniPut = 0.5 * ubrzanje * vreme * vreme;
		predjeniPut = predjeniPut + pocetnaBrzina * vreme;
		
		System.out.printf("Predjeni put nakon %.2f sekundi je %.2fm.", vreme, predjeniPut);
	}
}
