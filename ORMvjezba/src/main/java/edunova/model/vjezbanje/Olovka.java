/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model.vjezbanje;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author mkordic
 */
@Entity(name = "olovke")
public class Olovka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(100)",nullable=false)
    private String proizvodac;
    private Boolean ispravan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public Boolean getIspravan() {
        return ispravan;
    }

    public void setIspravan(Boolean ispravan) {
        this.ispravan = ispravan;
    }
    

    
}
