/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.model.Riba;
import ffos.model.Ribar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marko
 */
public class ObradaRiba extends Obrada<Riba>{
    
    
    public void SetData(int broj, String datumMrijestenja, Ribar ribar){
    if(getEntitet()==null){
    Riba r = new Riba();
     SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            r.setBroj(broj);
            r.setDatumMrijestenja((Date)df.parse(datumMrijestenja));
            r.setRibar(ribar);
        } catch (Exception e) {
        } setEntitet(r);
    } else {
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try {
            getEntitet().setBroj(broj);
            getEntitet().setDatumMrijestenja((Date)df.parse(datumMrijestenja));
            getEntitet().setRibar(ribar);
        } catch (Exception e) {
        }
    }
        
    }
    
    public List <Riba> read(){
    return session.createQuery("from Riba").list();
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
    
}
