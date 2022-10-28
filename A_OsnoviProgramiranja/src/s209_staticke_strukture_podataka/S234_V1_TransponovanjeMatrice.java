package s209_staticke_strukture_podataka;

public class S234_V1_TransponovanjeMatrice {

	public static void main(String[] args) {
		
	
		int[][] matrica = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++)
				System.out.print(matrica[i][j] + " ");
			System.out.println();
		}
		System.out.println();

		int[][] transponovana = new int[matrica.length][matrica[0].length];
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				transponovana[i][j] = matrica[j][i];
			}
		}
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(transponovana[i][j] + " ");
			}
			System.out.println();
		}
	}
}
