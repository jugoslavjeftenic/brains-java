package s198_zaposleni;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import alati.RADE;

public class GenerisiSpisak {
	/*
	 * U ulaznoj datoteci zapisana je najpre cena rada, zatim broj radnika u
	 * preduzecu, a zatim slede podaci o svim radnicima. Podaci o jednom radniku
	 * pocinju linijom u kojoj je zapisan simbol + ili -. Simbol + oznacava da slede
	 * podaci o aktivnom radniku, a – da slede podaci o radniku koji se trenutno
	 * nalazi na bolovanju. Platni spisak ispisati u izlaznu datoteku plate.txt.
	 * ime radnika, prezime radnika, JMBG, broj tekuceg racuna i koeficijent strucne spreme,
	 */
	
	private GenerisiSpisak() {}

	protected static void generisiSpisak(String filePath, double cenaRada, int brojRadnika) {
		String linija = "";
        BufferedWriter bw = null;
		try {
            bw = new BufferedWriter(new FileWriter(filePath + "spisak.txt"));
            linija = cenaRada + ";" + brojRadnika;
            bw.write(linija);
            for (int i = 0; i < brojRadnika; i++) {
            	linija = "";
                bw.newLine();
            	linija += RADE.mrRobot(0, 5) > 0 ? "+" : "-";
            	linija += ";" + RADE.generisiIme(0) + ";" + RADE.generisiPrezime();
            	linija += ";" + RADE.generisiJMBG() + String.format(";320-9876543%2d-73", i).replace(" ", "0");
            	linija += ";" + String.format("%.2f", RADE.mrRobot(0.1, 10.0)) ;
                bw.write(linija);
            }
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
}
