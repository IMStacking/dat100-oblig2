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

		// i = radnummer, matrise.length er antall rader.
		for (int i = 0; i < matrise.length; i++) {

			// j = kolonnenummer. matrise[i].length er lengden raden.
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

			// Opprette en matrise med like mange rader som originalt
			int[][] resultat = new int[matrise.length][];

			for (int i = 0; i < matrise.length; i++) {

				// Kvar rad får lik lengde som tilsvarende rad i originalt
				resultat[i] = new int[matrise[i].length];

				for (int j = 0; j < matrise[i].length; j++) {
					resultat[i][j] = matrise[i][j] * tall;
				}
			}

			return resultat;
		}
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		    if (a == b) {
        return true;
    }

    if (a == null || b == null || a.length != b.length) {
        return false;
    }

    for (int i = 0; i < a.length; i++) {
        if (a[i].length != b[i].length) {
            return false;
        }

        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] != b[i][j]) {
                return false;
            }
        }
    }

    return true;
	}
	

}
