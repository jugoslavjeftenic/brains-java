package s198_zaposleni;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class SpisakRadnika {

	private String filePath;
	private double cenaRada;
	private int ukupnoZaposlenih;
	private ArrayList<Radnik> radnici = new ArrayList<Radnik>();
	
	
	public SpisakRadnika(String filePath) {
		this.filePath = filePath;
	}


	public void ucitajPodatke() {
		// www.baeldung.com/java-check-string-number
		// stackoverflow.com/questions/3133770/how-to-find-out-if-the-value-contained-in-a-string-is-double-or-not
		String regExp = "[\\x00-\\x20]*[+-]?(((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*";
		String line = "";
		int brojac = 1;
		InputStreamReader reader = null;
		BufferedReader br = null;
		try {
			reader = new InputStreamReader(new FileInputStream(filePath + "spisak.txt"), "UTF-8");
			br = new BufferedReader(reader);
			while ((line = br.readLine()) != null) {
				String[] tmpArray;
				tmpArray = line.split(";");
				if (tmpArray[0].matches(regExp)) {
					cenaRada = Double.parseDouble(tmpArray[0]);
					ukupnoZaposlenih = Integer.parseInt(tmpArray[1]);
					System.out.println("Cena rada: " + cenaRada);
					System.out.println("Zaposlenih: " + ukupnoZaposlenih);
				}
				else if (tmpArray[0].matches("[+]")) {
					//
				}
				else if (tmpArray[0].matches("[-]")) {
					//
				}
				else {
					System.out.println("PAZNJA! Linija " + brojac + " ne pocinje sa ocekivanim podacima. Linija nije ucitana.");
				}
				brojac++;
			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("PAZNJA! Doslo je do greske prilikom enkodovanja karaktera u UTF-8 format.");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("PAZNJA! Datoteka \"" + filePath + "spisak.txt\" nije pronadjena.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("PAZNJA! Doslo je do nepoznate IO greske prilikom citanja datoteke \"" + filePath + "spisak.txt\"");
			e.printStackTrace();
		}
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
