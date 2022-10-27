package s259_mali_fudbal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import alati.RADE;

public class ListaUtakmica {

	private int brojUtakmica;
	private ArrayList<Tim> listaTimova = new ArrayList<Tim>();
	private ArrayList<Utakmica> listaUtakmica = new ArrayList<Utakmica>();
	
	public ListaUtakmica() {
		brojUtakmica = 0;
	}
	
	public ListaUtakmica(ArrayList<Tim> listaTimova) {
		this.brojUtakmica = 0;
		this.listaTimova = listaTimova;
	}

	public ListaUtakmica(int brojUtakmica, ArrayList<Tim> listaTimova) {
		this.brojUtakmica = brojUtakmica;
		this.listaTimova = listaTimova;
	}

	public void generisi() {
		for (int i = 0; i < brojUtakmica; i++) {
			int indeksA = RADE.mrRobot(0, listaTimova.size());
			int indeksB = RADE.mrRobot(0, listaTimova.size());
			while (indeksA == indeksB)
				indeksB = RADE.mrRobot(0, listaTimova.size());
			Tim timA = listaTimova.get(indeksA);
			Tim timB = listaTimova.get(indeksB);
			String[] utakmica = {"neodigrana", "prviPobedio", "drugiPobedio", "nereseno"};
			String rezultat = utakmica[RADE.mrRobot(0, utakmica.length)];
			Utakmica novaUtakmica = new Utakmica(timA.getImeTima(), timB.getImeTima(), rezultat);
			listaUtakmica.add(novaUtakmica);
		}
	}
	
	public void upisi(String filePath) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(filePath + "utakmice.txt"));
			for (Utakmica utakmica : listaUtakmica) {
				pw.println(utakmica.getTim1() + ";" + utakmica.getTim2() + ";" + utakmica.getRezultat() + ";");
			}
		} catch (IOException e) {
			System.out.println("Desila se napoznata greska prilikom upisivanja u datoteku!");
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

	public void ucitaj(String filePath) {
		listaUtakmica.removeAll(listaUtakmica);
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filePath + "utakmice.txt"));
			scanner.useDelimiter(";");
			do {
				String tim1 = scanner.next();
				// TODO Napraviti bolje resenje za CR LF problem.
				tim1 = tim1.replaceAll("(\\r|\\n)", "");
				String tim2 = scanner.next();
				String rezultat = scanner.next();
				Utakmica novaUtakmica = new Utakmica(tim1, tim2, rezultat);
				listaUtakmica.add(novaUtakmica);
			} while (scanner.hasNext());
		}
		catch (FileNotFoundException e) {
			System.out.println("Datoteka nije pronadjena!");
		}
		catch (NoSuchElementException e) {}
		finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
	
	public void dodaj(String tim1, String tim2) {
		String[] utakmica = {"neodigrana", "prviPobedio", "drugiPobedio", "nereseno"};
		Utakmica novaUtakmica = new Utakmica(tim1, tim2, utakmica[RADE.mrRobot(0, utakmica.length)]);
		listaUtakmica.add(novaUtakmica);
	}

	public void dodaj(String tim1, String tim2, String rezultat) {
		Utakmica novaUtakmica = new Utakmica(tim1, tim2, rezultat);
		listaUtakmica.add(novaUtakmica);
	}

	public Utakmica trazi(String tim1, String tim2) {
		for (Utakmica utakmica : listaUtakmica)
			if (tim1.equalsIgnoreCase(utakmica.getTim1()) && tim2.equalsIgnoreCase(utakmica.getTim2()))
				return utakmica;
		return null;
	}

	public void brisi(String tim1, String tim2) {
		listaUtakmica.remove(trazi(tim1, tim2));
	}

	public void stampaj() {
		int i = 1;
		for (Utakmica utakmica : listaUtakmica) {
			System.out.printf("%3d. %-15s %-15s [%s]\n", i, utakmica.getTim1(), utakmica.getTim2(), utakmica.getRezultat());
			i++;
		}
	}

	public int getBrojUtakmica() {
		return brojUtakmica;
	}

	public void setBrojUtakmica(int brojUtakmica) {
		this.brojUtakmica = brojUtakmica;
	}
	
	public ArrayList<Tim> getListaTimova() {
		return listaTimova;
	}
	
	public void setListaTimova(ArrayList<Tim> listaTimova) {
		this.listaTimova = listaTimova;
	}

	public ArrayList<Utakmica> getListaUtakmica() {
		return listaUtakmica;
	}

	public void setListaUtakmica(ArrayList<Utakmica> listaUtakmica) {
		this.listaUtakmica = listaUtakmica;
	}
}
