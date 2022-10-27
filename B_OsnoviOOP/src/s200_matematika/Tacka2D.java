package s200_matematika;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Tacka2D implements Tacka {

	private double x, y;
	
	public Tacka2D() {}
	
	public Tacka2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void ucitajKoordinate(String filePath) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filePath)).useLocale(Locale.US);
			setX(scanner.nextDouble());
			setY(scanner.nextDouble());
		} catch (FileNotFoundException e) {
			System.out.println("Datoteka sa koordinatama nije pronadjena, koordinate ce biti popunjene nulama!");
		} finally {
			if (scanner != null)
				scanner.close();
		}
	}

	@Override
	public double izracunajUdaljenostOdNule() {
		return Math.sqrt((x * x) + (y * y));
	}

	@Override
	public boolean daLiSamOrt() {
		return (izracunajUdaljenostOdNule() == 1);
	}

	@Override
	public boolean daLiSamNaKoordinatnojOsi() {
		return (x == 0 || y == 0);
	}

	@Override
	public void sacuvajTacku(String filePath) {
		FileWriter fileWrite = null;
		try {
			fileWrite = new FileWriter(filePath);
			fileWrite.write("(" + getX() + ", " + getY() + ")");
		} catch(IOException e) {
			System.out.println("Doslo je do nepoznate greske prilikom upisa u datoteku!");
		} finally {
			if(fileWrite != null) {
				try {
					fileWrite.close();
				} catch (IOException e) {
					System.out.println("Doslo je do nepoznate greske prilikom zatvaranja datoteke!");
				}
			}
		}
	}
}
