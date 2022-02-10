package program;

import java.util.ArrayList;
import java.util.List;

import model.Sastojak;
import model.Sendvic;
import subota.Zadaci;

public class Start {
	public static void main(String[] args) {
		Zadaci zadaci = new Zadaci();

		Sendvic sendvic = new Sendvic();

		sendvic.setNaziv("Mexicki");
		List<Sastojak> sastojci = new ArrayList<>();

		Sastojak s = new Sastojak();

		s.setNaziv("Kukuruz");
		s.setKolicina(10);
		sastojci.add(s);

		s.setNaziv("Piletina");
		s.setKolicina(20);
		sastojci.add(s);

		s.setNaziv("Umak");
		s.setKolicina(10);
		sastojci.add(s);

		s.setNaziv("Salata");
		s.setKolicina(10);
		sastojci.add(s);

		sendvic.setSastojci(sastojci);

		System.out.println(sendvic);

		sendvic = new Sendvic();

		sendvic.setNaziv("Slavonski");

		sastojci = new ArrayList<Sastojak>();

		s = new Sastojak("Kulen", 20);

		sastojci.add(s);

		sastojci.add(new Sastojak("Salata", 10));
		sastojci.add(new Sastojak("Pršut", 20));
		sastojci.add(new Sastojak("Majonez", 20));

		sendvic.setSastojci(sastojci);

		System.out.println(sendvic);

	}
}
