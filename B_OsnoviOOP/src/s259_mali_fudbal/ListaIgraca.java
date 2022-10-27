package s259_mali_fudbal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

import alati.RADE;

public class ListaIgraca {

	private ArrayList<Tim> listaTimova = new ArrayList<Tim>();
	private ArrayList<Igrac> listaIgraca = new ArrayList<Igrac>();
	
	public ListaIgraca() {}

	public ListaIgraca(ArrayList<Tim> listaTimova) {
		this.listaTimova = listaTimova;
	}

	public void generisi() {
		for (int i = 0; i < listaTimova.size(); i++) {
			for (int j = 0; j < listaTimova.get(i).getBrojIgraca(); j++) {
				String ime = RADE.generisiIme(0);
				String prezime = RADE.generisiPrezime();
				String jmbg = RADE.generisiJMBG();
				String tim = listaTimova.get(i).getImeTima();
				Igrac igrac = new Igrac(ime, prezime, jmbg, tim);
				listaIgraca.add(igrac);
			}
		}
	}
	
	public void generisiPoTimu(Tim dodajTim) {
		for (int i = 0; i < dodajTim.getBrojIgraca(); i++) {
			String ime = RADE.generisiIme(0);
			String prezime = RADE.generisiPrezime();
			String jmbg = RADE.generisiJMBG();
			String tim = dodajTim.getImeTima();
			Igrac igrac = new Igrac(ime, prezime, jmbg, tim);
			listaIgraca.add(igrac);
		}
	}
	
	public void upisi(String filePath) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(filePath + "igraci.txt"));
			for (Igrac igrac : listaIgraca) {
				pw.println(igrac.getIme() + ";" + igrac.getPrezime() + ";" + igrac.getJmbg() + ";" + igrac.getTim() + ";");
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
		listaIgraca.removeAll(listaIgraca);
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filePath + "igraci.txt"));
			scanner.useDelimiter(";");
			do {
				String ime = scanner.next();
				// TODO Napraviti bolje resenje za CR LF problem.
				ime = ime.replaceAll("(\\r|\\n)", "");
				String prezime = scanner.next();
				String jmbg = scanner.next();
				String tim = scanner.next();
				Igrac noviIgrac = new Igrac(ime, prezime, jmbg, tim);
				listaIgraca.add(noviIgrac);
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

	public void dodaj(String ime, String prezime, String jmbg, String tim) {
		// TODO Napraviti kontrolu da li igrac postoji.
		// TODO Napraviti kontrolu da li je tim popunjen.
		Igrac noviIgrac = new Igrac(ime, prezime, jmbg, tim);
		listaIgraca.add(noviIgrac);
	}

	public Igrac trazi(String imeIgraca) {
		Iterator<Igrac> iterator = listaIgraca.iterator();
		while (iterator.hasNext()) {
			Igrac igrac = iterator.next();
			if (igrac.getIme().toLowerCase().equals(imeIgraca.toLowerCase())) {
				return igrac;
			}
		}
		return null;
	}

	public void brisi(String imeIgraca) {
		listaIgraca.remove(trazi(imeIgraca));
	}

	public void stampaj() {
		int i = 1;
		for (Igrac igrac : listaIgraca) {
			System.out.printf("%3d. %-8s %-12s [JMBG: %s], %s\n", i, igrac.getIme(), igrac.getPrezime(), igrac.getJmbg(), igrac.getTim());
			i++;
		}
	}

	public ArrayList<Tim> getListaTimova() {
		return listaTimova;
	}

	public void setListaTimova(ArrayList<Tim> listaTimova) {
		this.listaTimova = listaTimova;
	}

	public ArrayList<Igrac> getListaIgraca() {
		return listaIgraca;
	}

	public void setListaIgraca(ArrayList<Igrac> listaIgraca) {
		this.listaIgraca = listaIgraca;
	}
}
