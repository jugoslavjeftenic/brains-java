package s185_tokovi_datoteka;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class s190_BajtTok {

	public static void main(String[] args) throws IOException {
		
		FileInputStream ulaz = null;
		FileOutputStream izlaz = null;
		try {
			ulaz = new FileInputStream("s185_tokovi_datoteka/ulazBajt.txt");
			izlaz = new FileOutputStream("s185_tokovi_datoteka/izlazBajt.txt");
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
