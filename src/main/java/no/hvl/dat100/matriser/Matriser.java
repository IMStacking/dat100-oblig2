package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			for (int verdi : rad) {
				System.out.print(verdi + " ");
			}
			System.out.println();
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String tekst = "";

		// i = radnummer. matrise.length er antall rader.
		for (int i = 0; i < matrise.length; i++) {

			// j = kolonnenummer. matrise[i].length er lengden på nettopp denne raden.
			for (int j = 0; j < matrise[i].length; j++) {
				tekst = tekst + matrise[i][j] + " ";
			}

			// Linjeskift etter hver ferdig rad
			tekst = tekst + "\n";
		}

		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
