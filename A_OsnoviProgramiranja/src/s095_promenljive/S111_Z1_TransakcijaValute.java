package s095_promenljive;

public class S111_Z1_TransakcijaValute {

	public static void main(String[] args) {
		
		double rsd = 155_000, kurs = 117.5;
		double evro = rsd / kurs;
		
		System.out.println("Kupili ste: " + evro + " evra po ceni od " + kurs + " dinara po evru.");
		System.out.println("Za kupovinu evra ste utrošili " + rsd + " dinara.");

	}

}
