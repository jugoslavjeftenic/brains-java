package s147_stringovi;

public class S149_StringFunkcije {

	public static void main(String[] args) {
		
		String str1, str2, str3;
		str1 = "Jugoslav Jeftenic";
		str2 = "Jugoslav";
		str3 = "jugoslav";
		
		System.out.println("Rezultat poredjenja sadrzaja stringa \"" + str2 + "\" i \"" + str3 +
				"\" funkcijom .equals je:           " + str2.equals(str3));
		System.out.println("Rezultat poredjenja sadrzaja stringa \"" + str2 + "\" i \"" + str3 +
				"\" funkcijom .equalsIgnoreCase je: " + str2.equalsIgnoreCase(str3));
		System.out.println();

		System.out.println("Duzina sadrzaja stringa \"" + str1 + "\" je: " + str1.length() + " karaktera");
		System.out.println("Treci karakter u stringu \"" + str1 + "\" je: " + str1.charAt(2));
		System.out.println("Substring stringa \"" + str1 + "\" od 3-ceg do 6-tog karaktera je: \"" + str1.substring(2, 5) + "\"");
		System.out.println("Substring \"" + str1.substring(2, 5) + "\" u stringu \"" + str1 + "\" pocinje od pozicije: " +
				(str1.indexOf(str1.substring(2, 5)) + 1));
		System.out.println();

		System.out.println("str1.compareTo(str1) " + str1.compareTo(str1));
		System.out.println("str1.compareTo(str2) " + str1.compareTo(str2));
		System.out.println("str2.compareTo(str1) " + str2.compareTo(str1));
		System.out.println();

		System.out.println("str1.toUpperCase " + str1.toUpperCase());
		System.out.println("str1.toLowerCase " + str1.toLowerCase());
		System.out.println();

		System.out.print("Primer konkatenacije stringa \"" + str1 + "\" sa po tri razmaka ispred i iza stringa: ");
		str1 = "   " + str1 + "   ";
		System.out.println("\"" + str1 + "\"");
		System.out.println("Rezultat trimovanja stringa \"" + str1 + "\" je: \"" + str1.trim() + "\"");

	}

}
