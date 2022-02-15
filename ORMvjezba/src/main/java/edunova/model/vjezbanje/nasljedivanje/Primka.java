/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model.vjezbanje.nasljedivanje;

import javax.persistence.Entity;

/**
 *
 * @author CP
 */
@Entity
public class Primka extends Dokument{
    private String dobavljac;

    public String getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(String dobavljac) {
        this.dobavljac = dobavljac;
    }
    
    
    
}
