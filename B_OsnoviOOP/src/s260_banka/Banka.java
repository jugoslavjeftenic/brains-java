package s260_banka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Banka implements RadSaKlijentima {

	private ArrayList<Klijent> klijenti;
	
	public Banka() {
		klijenti = new ArrayList<Klijent>();
	}
	
	@Override
	public void ucitajKlijente(String imeDatoteke) {
		BufferedReader br = null;
		Scanner s = null;
		try {
			br = new BufferedReader(new FileReader(imeDatoteke));
			s = new Scanner(br);
			while (s.hasNextLine()) {
				Klijent noviKlijent = new Klijent();
				noviKlijent.citaj(s);
				klijenti.add(noviKlijent);
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (s != null) {
				s.close();
			}
		}
	}
	
	@Override
	public void pisiKlijente(String imeDatoteke) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(imeDatoteke));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void stampaKlijenata() {
		for (Klijent klijent : klijenti) {
			System.out.println(klijent.getIme() + " " + klijent.getPrezime() + " " + klijent.getJmbg());
		}
	}
	
	@Override
	public void dodajKlijenta() {
		
	}
	
	@Override
	public void obrisiKlijenta() {
		
	}
	
	@Override
	public Klijent traziKlijenta(String jBroj) {
		return null;
	}
}
