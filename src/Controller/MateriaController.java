/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import modelo.Materia;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repositorio.MateriaDao;
import repositorio.Runner;
import repositorio.SessionFactoryProvider;

/**
 *
 * @author Bautista
 */
public class MateriaController {

    private Session session;
    private Transaction tx;
    private MateriaDao materiadao;
    private Materia materia;
    private Materia materianueva;
    
    public MateriaController(){
        materianueva = new Materia();
    }
    
    public void guardarUnaMateria(){
        try{
            guardarMateria();
        }catch(Exception e){
            System.out.println("Problem creating session factory");
            e.printStackTrace();
        }
    }
    
    private void guardarMateria(){
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        materiadao = new MateriaDao();
        materiadao.guardar(materianueva);
        tx.commit();
        session.close();
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTx() {
        return tx;
    }

    public void setTx(Transaction tx) {
        this.tx = tx;
    }

    public MateriaDao getMateriadao() {
        return materiadao;
    }

    public void setMateriadao(MateriaDao materiadao) {
        this.materiadao = materiadao;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Materia getMaterianueva() {
        return materianueva;
    }

    public void setMaterianueva(Materia materianueva) {
        this.materianueva = materianueva;
    }
    
    

}
