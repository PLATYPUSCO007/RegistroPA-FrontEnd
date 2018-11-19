/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import modelo.Ciudades;
import modelo.Departamentos;
import modelo.Identificacion;
import modelo.Profesor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repositorio.ProfesorDao;
import repositorio.Runner;
import repositorio.SessionFactoryProvider;

/**
 *
 * @author Bautista
 */
public class ProfesorController {
    
    private ProfesorDao profesordao;
    private Session session;
    private Transaction tx;
    private Profesor profesornuevo;
    private ArrayList<String> departamentos = new ArrayList<String>();
    private ArrayList<String> ciudades = new ArrayList<String>();
    private Departamentos[] dep;
    private Ciudades[] ciu;
    private List<Profesor> traerProfesores;
    private ArrayList<String> tipoIdentificacion = new ArrayList<String>();
    private Identificacion[] iden;
    private List<Profesor> buscarProfesores;
    private String campo;
    private String valor;
    private Profesor profesoractualizar;
    private int key = 0;
    
    public ProfesorController(){
        profesornuevo = new Profesor();
        enumCiudades();
        enumDepartamentos();
        enumIdentificacion();
        listaProfesores();
    }
    
    public ArrayList<String> enumIdentificacion() {
        iden = Identificacion.values();
        for (Identificacion ident : iden) {
            tipoIdentificacion.add(ident.toString());
        }
        return tipoIdentificacion;
    }

    public ArrayList<String> enumDepartamentos() {
        dep = Departamentos.values();
        for (Departamentos depa : dep) {
            departamentos.add(depa.toString());
        }
        return departamentos;
    }

    public ArrayList<String> enumCiudades() {
        ciu = Ciudades.values();
        for (Ciudades ciud : ciu) {
            ciudades.add(ciud.toString());
        }
        return ciudades;
    }

    public void guardarprofesornuevo() {
        try {
            guardarProfesor();
        } catch (HibernateException exception) {
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }
    }

    private void guardarProfesor() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        profesordao = new ProfesorDao();
        profesordao.guardar(profesornuevo);
        tx.commit();
        session.close();
    }

    public List<Profesor> listaProfesores() {
        return traerProfesores();
    }

    private List<Profesor> traerProfesores() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        profesordao = new ProfesorDao();
        traerProfesores = profesordao.traerTodo();
        tx.commit();
        session.close();
        return traerProfesores;
    }

    public List<Profesor> buscarPro() {
        return buscarProfesores();
    }

    private List<Profesor> buscarProfesores() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        profesordao = new ProfesorDao();
        try {
            if (campo.equalsIgnoreCase("identificacion")) {
                buscarProfesores = profesordao.recuperarVarios(campo, Integer.parseInt(valor));
            } else {
                buscarProfesores = profesordao.recuperarVarios(campo, valor);
            }
        } catch (Exception e) {
        }
        tx.commit();
        session.close();
        campo = "";
        valor = "";
        return buscarProfesores;
    }

    public Profesor traerUnProfesor() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        profesordao = new ProfesorDao();
        profesoractualizar = profesordao.recuperar(key);
        tx.commit();
        session.close();
        return profesoractualizar;
    }

    public void editar() {
        try {
            editarProfesor();
        } catch (HibernateException exception) {
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }
    }

    private void editarProfesor() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        profesordao = new ProfesorDao();
        profesordao.actualizar(profesoractualizar);
        tx.commit();
        session.close();
    }

    public void eliminar() {
        eliminarProfesor();
    }

    private void eliminarProfesor() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        profesordao = new ProfesorDao();
        profesordao.borrar("id", key);
        tx.commit();
        session.close();
    }

    public ProfesorDao getProfesordao() {
        return profesordao;
    }

    public void setProfesordao(ProfesorDao profesordao) {
        this.profesordao = profesordao;
    }

    public Profesor getProfesornuevo() {
        return profesornuevo;
    }

    public void setProfesornuevo(Profesor profesornuevo) {
        this.profesornuevo = profesornuevo;
    }

    public ArrayList<String> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<String> departamentos) {
        this.departamentos = departamentos;
    }

    public ArrayList<String> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<String> ciudades) {
        this.ciudades = ciudades;
    }

    public Departamentos[] getDep() {
        return dep;
    }

    public void setDep(Departamentos[] dep) {
        this.dep = dep;
    }

    public Ciudades[] getCiu() {
        return ciu;
    }

    public void setCiu(Ciudades[] ciu) {
        this.ciu = ciu;
    }

    public List<Profesor> getTraerProfesores() {
        return traerProfesores;
    }

    public void setTraerProfesores(List<Profesor> traerProfesores) {
        this.traerProfesores = traerProfesores;
    }

    public ArrayList<String> getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(ArrayList<String> tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Identificacion[] getIden() {
        return iden;
    }

    public void setIden(Identificacion[] iden) {
        this.iden = iden;
    }

    public List<Profesor> getBuscarProfesores() {
        return buscarProfesores;
    }

    public void setBuscarProfesores(List<Profesor> buscarProfesores) {
        this.buscarProfesores = buscarProfesores;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Profesor getProfesoractualizar() {
        return profesoractualizar;
    }

    public void setProfesoractualizar(Profesor profesoractualizar) {
        this.profesoractualizar = profesoractualizar;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    
    
}
