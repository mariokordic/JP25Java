package edunova;

public class E05_TipPodatkaSParametrima {
	public static void main(String[] args) {
		//System.out.println(zbroj(E04_TipPodatakaBezParametara.ucitajBroj(), E04_TipPodatakaBezParametara.ucitajBroj()));
	    //System.out.println(sumaPrimBrojeva(3, 100));
	    System.out.println(najmanji(E04_TipPodatakaBezParametara.ucitajNiz()));
	}

	private static int zbroj(int i, int j) {
		return i + j;
	}

	private static boolean prim(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static int sumaPrimBrojeva(int min, int max) {
		int suma = 0;

		for (int i = min; i <= max; i++) {
			if (prim(i)) {
				suma += i;
			}
		}

		return suma;
	}
	
	//Metoda koja u primljenom nizu cijelih brojeva pronalazi najmanji
	
	public static int najmanji(int[]niz) {
		int najmanji = Integer.MAX_VALUE;
		
		for(int i: niz) {
			if(i<najmanji) {
				najmanji=i;
			}
		}
		return najmanji;
	}

}
