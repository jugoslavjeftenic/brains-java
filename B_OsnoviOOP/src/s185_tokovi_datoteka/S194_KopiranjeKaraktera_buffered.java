package s185_tokovi_datoteka;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class S194_KopiranjeKaraktera_buffered {

	public static void main(String[] args) throws IOException {
		
		BufferedReader ulaz = null;
		BufferedWriter izlaz = null;
		try {
			ulaz = new BufferedReader(new FileReader("src/s185_tokovi_datoteka/unos.txt"));
			izlaz = new BufferedWriter(new FileWriter("src/s185_tokovi_datoteka/ispis.txt"));
//			ulaz = new FileReader("src/s185_tokovi_datoteka/ulazKarakter.txt");
//			izlaz = new FileWriter("src/s185_tokovi_datoteka/izlazKarakter.txt");
			int c;
			while ((c = ulaz.read()) != -1) {
				izlaz.write(c);
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if (ulaz != null) {
				ulaz.close();
			}
			if (izlaz != null) {
				izlaz.close();
			}
		}
	}
}
