package s219_spisak_polaznika;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Spisak {
	
	ArrayList<Osoba> listaPolaznika;

	public void ucitajListu(String imeDatoteke) {
		Scanner scanner = null;
		ArrayList<Osoba> listaPolaznika = new ArrayList<Osoba>();
		try {
			scanner = new Scanner(new File(imeDatoteke));
			do {
				String ime = scanner.next();
				String prezime = scanner.next();
				String jmbg = scanner.next();
				Osoba noviPolaznik = new Osoba(ime, prezime, jmbg);
				listaPolaznika.add(noviPolaznik);
			} while (scanner.hasNext());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		this.listaPolaznika = listaPolaznika;
	}
	
	public void sortirajListu() {
		Collections.sort(listaPolaznika, new MojKomparator());
	}
	
	public void stampajListu() {
		System.out.println(Arrays.toString(this.listaPolaznika.toArray()));
	}
	
	public void upisiListu(String imeDatoteke) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeDatoteke));
			for (Osoba polaznik: this.listaPolaznika) {
				pw.println(polaznik.getIme() + ", " + polaznik.getPrezime() + ", " + polaznik.getJmbg());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
