/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.model.Cura;
import java.util.List;

/**
 *
 * @author marko
 */
public class ObradaCura extends Obrada<Cura>{
        public void setPodaci(float maraka,String vesta,float kuna,String dukserica){
        if(entitet==null){
            entitet = new Cura();
        }
        
        entitet.setKuna(kuna);
        entitet.setMaraka(maraka);
        entitet.setVesta(vesta);
        entitet.setDukserica(dukserica);
        
    }

    @Override
    public void kontrolaCreate() throws Exception {
        
    }

    @Override
    public void kontrolaUpdate() throws Exception {
        
    }

    @Override
    public void kontrolaDelete() throws Exception {
        
    }

    @Override
    public List<Cura> read() {
        // from Mjesto je HQL
        return session.createQuery("from Cura").list();
    }
}
