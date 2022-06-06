/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marko
 */
@Entity
public class Riba extends Entitet{
    private Integer broj;
    @Temporal(TemporalType.DATE)
    private Date datumMrijestenja;
    @ManyToOne
    private Ribar ribar;

    public Integer getBroj() {
        return broj;
    }

    public void setBroj(Integer broj) {
        this.broj = broj;
    }

    public Date getDatumMrijestenja() {
        return datumMrijestenja;
    }

    public void setDatumMrijestenja(Date datumMrijestenja) {
        this.datumMrijestenja = datumMrijestenja;
    }

    public Ribar getRibar() {
        return ribar;
    }

    public void setRibar(Ribar ribar) {
        this.ribar = ribar;
    }
    
    @Override
    public String toString(){
    return broj + " " + datumMrijestenja + " " + ribar;
    }
    
}
