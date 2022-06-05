/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.model;

import javax.persistence.Entity;

/**
 *
 * @author marko
 */
@Entity
public class Cura extends Entitet{
    private float maraka;
    private String vesta;
    private float kuna;
    private String dukserica;

    public float getMaraka() {
        return maraka;
    }

    public void setMaraka(float maraka) {
        this.maraka = maraka;
    }

    public String getVesta() {
        return vesta;
    }

    public void setVesta(String vesta) {
        this.vesta = vesta;
    }

    public float getKuna() {
        return kuna;
    }

    public void setKuna(float kuna) {
        this.kuna = kuna;
    }

    public String getDukserica() {
        return dukserica;
    }

    public void setDukserica(String dukserica) {
        this.dukserica = dukserica;
    }
    
}
