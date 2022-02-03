package edunova.frizerski;

import java.util.Date;

public class Termin extends Entitet{
	
	private Djelatnik djelatnik;
	private Korisnik korisnik;
	private Date datumIvrijeme;
	private String napomena;
	
	public Djelatnik getDjelatnik() {
		return djelatnik;
	}
	public void setDjelatnik(Djelatnik djelatnik) {
		this.djelatnik = djelatnik;
	}
	public Korisnik getKorisnik() {
		return korisnik;
	}
	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	public Date getDatumIvrijeme() {
		return datumIvrijeme;
	}
	public void setDatumIvrijeme(Date datumIvrijeme) {
		this.datumIvrijeme = datumIvrijeme;
	}
	public String getNapomena() {
		return napomena;
	}
	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
	
	
	
	

}
