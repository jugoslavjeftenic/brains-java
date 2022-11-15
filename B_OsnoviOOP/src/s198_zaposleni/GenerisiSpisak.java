package s198_zaposleni;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import alati.RADE;

public class GenerisiSpisak {
	
	private GenerisiSpisak() {}

	protected static void generisiSpisak(String filePath, double cenaRada, int brojRadnika) {
		
		String linija = "";
		OutputStreamWriter writer = null;
        BufferedWriter bw = null;
		try {
			writer = new OutputStreamWriter(new FileOutputStream(filePath + "spisak.txt"), "UTF-8");
			bw = new BufferedWriter(writer);
            linija = cenaRada + ";" + brojRadnika;
            bw.write(linija);
            for (int i = 0; i < brojRadnika; i++) {
            	linija = "";
                bw.newLine();
            	linija += RADE.mrRobot(0, 5) > 0 ? "+" : "-";
            	linija += ";" + RADE.generisiIme(0) + ";" + RADE.generisiPrezime();
            	linija += ";" + RADE.generisiJMBG() + String.format(";320-9876543%2d-73", i).replace(" ", "0");
            	linija += ";" + String.format("%.2f", RADE.mrRobot(1.0, 10.0)) ;
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
