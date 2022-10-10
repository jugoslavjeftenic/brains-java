package s147_stringovi;
public class S152_StringZadaci {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji odreðuje broj slova u ulaznom stringu.
		 */
		
		String string = "Jugoslav";
		System.out.println("Duzina stringa \"" + string + "\" je " + string.length() + ".");
		System.out.println();
		
		/*
		 * Napisati program koji pakuje reèi iz više stringova u jedan string.
		 * Nakon svakog dodatog stringa ubaciti prazno mesto.
		 */
		
		String str1 = "Jugoslav", str2 = "Jeftenic", str3 = "pvtBomba";
		String spakovano = str1 + " \"" + str3 + "\" " + str2;
		System.out.println(spakovano);
		System.out.println();
		
		/*
		 * Napisati program koji prebacuje mala slova u velika slova u ulaznom stringu
		 * bez korišæenja string funkcija.
		 */
		
		System.out.printf("%S", "Jugoslav");

	}

}
