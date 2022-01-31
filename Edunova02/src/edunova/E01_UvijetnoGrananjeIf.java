package edunova;

public class E01_UvijetnoGrananjeIf {
	public static void main(String[] args) {
		int i = 10;
		boolean uvjet = i < 7;

		if (uvjet) {
			System.out.println("OK");
		}

		if (i <= 7) {
			System.out.println("OK 2");
		}

		if (i < 7) {
			System.out.println("OK 3");
		} else {
			System.out.println("OK 4");
		}

		// and

		int j = 0, k = 1;

		if (i > 10 & k == 1) {
			System.out.println("OK 7");
		}
		if (i > 10 && k == 1) {
			System.out.println("OK 8");
		}

		// or

		if (i == 1 | i == 10) {
			System.out.println("OK 9");
		}

		// | uvjek provjerava oba uvjeta
		// || u slučaju zadovoljena prvog uvijeta ne provjerava se drugi

		if (i == 1 || i == 10) {
			System.out.println("OK 10");
		}

		// not

		if (!(i < 7)) {
			System.out.println("OK 11");
		}

		// puna sintaska if naredbe

		if (i == 1) {
			System.out.println("Nedovoljan");
		} else if (i == 2) {
			System.out.println("Dovoljan");
		} else if (i == 3) {
			System.out.println("Dobar");
		} else {
			System.out.println("Ovo nitko neće imati");
		}

		if (i < 7) {
			int t = 3;
			System.out.println("OK 12");

			if (t > 3) {
				System.out.println("OK 13");
			}
		}
		// System.out.println(t);

		int a = 12;
		if (a == 12) {
			System.out.println("DA");
		} else {
			System.out.println("NE");
		}

		System.out.println(a == 12 ? "DA" : "NE");
	}
}
