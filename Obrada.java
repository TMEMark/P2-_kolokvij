/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kolokvij0.controller;

import ffos.kolokvij0.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public abstract class Obrada<T> {
    protected T entitet;
    protected Session session;
    public abstract void kontrolaCreate() throws Exception;
    public abstract void kontrolaUpdate() throws Exception;
    public abstract void kontrolaDelete() throws Exception;
    public abstract List<T> read();

    public Obrada() {
        session = HibernateUtil.getSession();
    }
    
    public void create() throws Exception{
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
    }
    
    
    
    
    
}
