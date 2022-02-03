package edunova.frizerski;

import java.math.BigDecimal;

public class Isporucena_usluga extends Entitet{
	private Usluga usluga;
	private Termin termin;
	private int kolicina;
	private BigDecimal ukupnaCijena;
	public Usluga getUsluga() {
		return usluga;
	}
	public void setUsluga(Usluga usluga) {
		this.usluga = usluga;
	}
	public Termin getTermin() {
		return termin;
	}
	public void setTermin(Termin termin) {
		this.termin = termin;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	public BigDecimal getUkupnaCijena() {
		return ukupnaCijena;
	}
	public void setUkupnaCijena(BigDecimal ukupnaCijena) {
		this.ukupnaCijena = ukupnaCijena;
	}
	
	

}
