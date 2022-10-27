package s219_spisak_polaznika;

import java.util.Comparator;

public class MojKomparator implements Comparator<Osoba> {

	@Override
	public int compare(Osoba o1, Osoba o2) {
		int uporedjeno = o1.getJmbg().compareTo(o2.getJmbg());
		if (uporedjeno > 0) {
			return -1;
		}
		else if (uporedjeno < 0) {
			return 1;
		}
		return 0;
	}
}
