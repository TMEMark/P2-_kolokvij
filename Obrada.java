/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.controller;

import ffos.utility.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author marko
 */
public abstract class Obrada<T> {
 
    private T entitet;
    protected Session session;
    public abstract void kontrolaCreate() throws Exception ;
    public abstract void kontrolaUpdate() throws Exception;
    public abstract void kontrolaDelete() throws Exception;
    
    public Obrada(){
        session=HibernateUtil.getSession();
    }
    
    public void create() throws Exception {
        kontrolaCreate();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    public void update() throws Exception{
        kontrolaUpdate();
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
    
    public void delete() throws Exception{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        setEntitet(null);
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
}
    
