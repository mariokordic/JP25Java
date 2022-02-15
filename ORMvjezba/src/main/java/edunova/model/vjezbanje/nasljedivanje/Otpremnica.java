/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model.vjezbanje.nasljedivanje;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author CP
 */
@Entity(name = "`select`")
public class Otpremnica extends Dokument{
    
    @Column(name = "`user`")
    private String kupac;

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }
    
    
    
}
