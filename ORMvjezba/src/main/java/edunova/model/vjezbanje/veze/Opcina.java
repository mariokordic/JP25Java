/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.model.vjezbanje.veze;

import edunova.model.vjezbanje.nasljedivanje.Dokument;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author CP
 */
@Entity
public class Opcina extends Dokument{
    
    private String naziv;
    
    @OneToMany(mappedBy = "opcina")
    private List<Mjesto> mjesta;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Mjesto> getMjesta() {
        return mjesta;
    }

    public void setMjesta(List<Mjesto> mjesta) {
        this.mjesta = mjesta;
    }
    
    
    
}
