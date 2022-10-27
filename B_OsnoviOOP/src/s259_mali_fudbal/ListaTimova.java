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

public class ListaTimova {
	
	private int brojTimova, minBrojIgracaPoTimu, maxBrojIgracaPoTimu;
	private ArrayList<Tim> listaTimova = new ArrayList<Tim>();
	
	public ListaTimova() {
		brojTimova = 5;
		minBrojIgracaPoTimu = 6;
		maxBrojIgracaPoTimu = 10;
	}
	
	public ListaTimova(int brojTimova, int minBrojIgracaPoTimu, int maxBrojIgracaPoTimu) {
		this.brojTimova = brojTimova;
		this.minBrojIgracaPoTimu = minBrojIgracaPoTimu;
		this.maxBrojIgracaPoTimu = maxBrojIgracaPoTimu;
	}

	public void generisi() {
		for (int i = 0; i < brojTimova; i++) {
			String ime = RADE.generisiTim();
			String grad = RADE.generisiGrad();
			Tim noviTim = new Tim(ime, grad, RADE.mrRobot(minBrojIgracaPoTimu, maxBrojIgracaPoTimu));
			for (int j =0; j < listaTimova.size(); j++) {
				if (noviTim.getImeTima().equals(listaTimova.get(j).getImeTima())) {
					if (listaTimova.get(j).getImeTima().lastIndexOf(" ") > 0) {
						String numerator = listaTimova.get(j).getImeTima().substring(listaTimova.get(j).getImeTima().lastIndexOf(" ") + 1);
						noviTim.setImeTima(noviTim.getImeTima().replaceAll(numerator, String.valueOf((Integer.parseInt(numerator) + 1))));
					}
					else {
						noviTim.setImeTima(ime + " 1");
					}
				}
			}
			listaTimova.add(noviTim);
		}
	}
	
	public void upisi(String filePath) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(filePath + "timovi.txt"));
			for (Tim tim : listaTimova) {
				pw.println(tim.getImeTima() + ";" + tim.getGrad() + ";" + tim.getBrojIgraca() + ";");
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
		listaTimova.removeAll(listaTimova);
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filePath + "timovi.txt"));
			scanner.useDelimiter(";");
			do {
				String ime = scanner.next();
				// TODO Napraviti bolje resenje za CR LF problem.
				ime = ime.replaceAll("(\\r|\\n)", "");
//				System.out.print(ime + ":");
				String grad = scanner.next();
//				System.out.print(grad + ":");
				int brojIgraca = scanner.nextInt();
//				System.out.print(brojIgraca + "\n");
				Tim noviTim = new Tim(ime, grad, brojIgraca);
				listaTimova.add(noviTim);
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

	public void dodaj(String imeTima, String gradTima, int brojIgracaUTimu) {
		// TODO Napraviti kontrolu da li tim postoji.
		Tim noviTim = new Tim(imeTima, gradTima, brojIgracaUTimu);
		listaTimova.add(noviTim);
	}

	public Tim trazi(String imeTima) {
		// https://www.baeldung.com/find-list-element-java
		// https://www.baeldung.com/java-iterator
		Iterator<Tim> iterator = listaTimova.iterator();
		while (iterator.hasNext()) {
			Tim tim = iterator.next();
			if (tim.getImeTima().toLowerCase().equals(imeTima.toLowerCase())) {
				return tim;
			}
		}
		return null;
	}

	public void brisi(String imeTima) {
		// https://www.geeksforgeeks.org/remove-element-arraylist-java/
		listaTimova.remove(trazi(imeTima));
	}
	
	public void stampaj() {
		int i = 1;
		for (Tim tim : listaTimova) {
			System.out.printf("%2d. %15s - %-10s [igraca: %d]\n", i, tim.getImeTima(), tim.getGrad(), tim.getBrojIgraca());
			i++;
		}
	}
	
	public int getBrojTimova() {
		return brojTimova;
	}

	public void setBrojTimova(int brojTimova) {
		this.brojTimova = brojTimova;
	}

	public int getMinBrojIgracaPoTimu() {
		return minBrojIgracaPoTimu;
	}

	public void setMinBrojIgracaPoTimu(int minBrojIgracaPoTimu) {
		this.minBrojIgracaPoTimu = minBrojIgracaPoTimu;
	}

	public int getMaxBrojIgracaPoTimu() {
		return maxBrojIgracaPoTimu;
	}

	public void setMaxBrojIgracaPoTimu(int maxBrojIgracaPoTimu) {
		this.maxBrojIgracaPoTimu = maxBrojIgracaPoTimu;
	}

	public ArrayList<Tim> getListaTimova() {
		return listaTimova;
	}

	public void setListaTimova(ArrayList<Tim> listaTimova) {
		this.listaTimova = listaTimova;
	}
}
