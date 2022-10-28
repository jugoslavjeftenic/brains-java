package s209_staticke_strukture_podataka;

public class S234_V2_MatricaSaWhilePetljom {

	public static void main(String[] args) {

		int[][] matrica = {{1,2,3},{4,5,6},{7,8,9}};
		int i = 0, j = 0;
		
		while (i < matrica.length) {
			
			while (j < matrica[i].length) {
				System.out.print(matrica[i][j] + " ");
				j++;
			}
			System.out.println();
			j = 0;
			i++;
		}
	}
}
