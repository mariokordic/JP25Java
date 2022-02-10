package model;

import java.util.ArrayList;
import java.util.List;

public class Sendvic {
	private String naziv;
	private List<Sastojak> sastojci = new ArrayList<Sastojak>();

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Sastojak> getSastojci() {
		return sastojci;
	}

	public void setSastojci(List<Sastojak> sastojci) {
		this.sastojci = sastojci;
	}

	public int getTezina() {
		int sum = 0;
		for (Sastojak s : sastojci) {
			sum += s.getKolicina();
		}

		return sum;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return getTezina()==0 ? naziv : naziv + " " + getTezina();
	}
}
