package s198_zaposleni;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import alati.RADE;

public class GenerisiSpisak {
	
	private GenerisiSpisak() {}

	protected static void generisiSpisak(String filePath, double cenaRada, int brojRadnika) {
		String line = "";
		OutputStreamWriter writer = null;
        BufferedWriter bw = null;
		try {
			writer = new OutputStreamWriter(new FileOutputStream(filePath + "spisak.txt"), "UTF-8");
			bw = new BufferedWriter(writer);
            line = cenaRada + ";" + brojRadnika;
            bw.write(line);
            for (int i = 0; i < brojRadnika; i++) {
            	line = "";
                bw.newLine();
            	line += RADE.mrRobot(0, 5) > 0 ? "+" : "-";
            	line += ";" + RADE.generisiIme(0) + ";" + RADE.generisiPrezime();
            	line += ";" + RADE.generisiJMBG() + String.format(";320-9876543%2d-73", i).replace(" ", "0");
            	line += ";" + String.format("%.2f", RADE.mrRobot(1.0, 10.0)) ;
                bw.write(line);
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
