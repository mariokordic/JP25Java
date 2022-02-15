/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model.vjezbanje.veze;

import edunova.model.vjezbanje.nasljedivanje.Dokument;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author CP
 */
@Entity
public class Mjesto extends Dokument{
    
    private String naziv;
    @ManyToOne
    private Opcina opcina;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Opcina getOpcina() {
        return opcina;
    }

    public void setOpcina(Opcina opcina) {
        this.opcina = opcina;
    }
    
    
    
}
