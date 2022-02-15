/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model.vjezbanje.veze;

import edunova.model.vjezbanje.nasljedivanje.Dokument;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author CP
 */
@Entity
public class Slika extends Dokument{
    
    private String autor;
    // čitati https://thorben-janssen.com/hibernate-tip-many-to-many-association-with-additional-attributes/
    @ManyToMany
    private List<Oznaka> oznake;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Oznaka> getOznake() {
        return oznake;
    }

    public void setOznake(List<Oznaka> oznake) {
        this.oznake = oznake;
    }
    
}
