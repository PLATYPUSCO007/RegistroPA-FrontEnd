/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Bautista
 */
import java.util.ArrayList;
import java.util.List;
import modelo.Ciudades;
import modelo.Departamentos;
import modelo.Estudiante;
import modelo.Identificacion;
import org.hibernate.HibernateException;
import repositorio.EstudianteDao;
import repositorio.Runner;
import repositorio.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EstudianteController {

    EstudianteDao estudiantedao;
    Session session;
    Transaction tx;
    Estudiante estudiante;
    Estudiante estudiantenuevo;
    ArrayList<String> departamentos = new ArrayList<String>();
    ArrayList<String> ciudades = new ArrayList<String>();
    Departamentos[] dep;
    Ciudades[] ciu;
    List<Estudiante> traerEstudiantes;
    ArrayList<String> tipoIdentificacion = new ArrayList<String>();
    Identificacion[] iden;
    List<Estudiante> buscarEstudiantes;
    String campo;
    String valor;
    Estudiante estudianteactualizar;
    int key = 0;

    public EstudianteController() {
        estudiantenuevo = new Estudiante();
        enumDepartamentos();
        listaEstudiantes();
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

    public void guardarestudiantenuevo() {
        try {
            guardarEstudiante();
        } catch (HibernateException exception) {
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }
    }

    private void guardarEstudiante() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        estudiantedao = new EstudianteDao();
        estudiantedao.guardar(estudiantenuevo);
        tx.commit();
        session.close();
    }

    public List<Estudiante> listaEstudiantes() {
        return traerEstudiantes();
    }

    private List<Estudiante> traerEstudiantes() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        estudiantedao = new EstudianteDao();
        traerEstudiantes = estudiantedao.traerTodo();
        tx.commit();
        session.close();
        return traerEstudiantes;
    }

    public List<Estudiante> buscarEstud() {
        return buscarEstudiantes();
    }

    private List<Estudiante> buscarEstudiantes() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        estudiantedao = new EstudianteDao();
        try {
            if (campo.equalsIgnoreCase("identificacion")) {
                buscarEstudiantes = estudiantedao.recuperarVarios(campo, Integer.parseInt(valor));
            } else {
                buscarEstudiantes = estudiantedao.recuperarVarios(campo, valor);
            }
        } catch (Exception e) {
        }
        tx.commit();
        session.close();
        campo = "";
        valor = "";
        return buscarEstudiantes;
    }

    public Estudiante traerUnEstudiante() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        estudiantedao = new EstudianteDao();
        estudianteactualizar = estudiantedao.recuperar(key);
        tx.commit();
        session.close();
        return estudianteactualizar;
    }

    public void editar() {
        try {
            editarEstudiante();
        } catch (HibernateException exception) {
            System.out.println("Problem creating session factory");
            exception.printStackTrace();
        }
    }

    private void editarEstudiante() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        estudiantedao = new EstudianteDao();
        estudiantedao.actualizar(estudianteactualizar);
        tx.commit();
        session.close();
    }

    public void eliminar() {
        eliminarEstudiante();
    }

    private void eliminarEstudiante() {
        session = SessionFactoryProvider.getInstance().createSession();
        tx = session.beginTransaction();
        Runner.addSession(session);
        estudiantedao = new EstudianteDao();
        estudiantedao.borrar("id", key);
        tx.commit();
        session.close();
    }

    public List<Estudiante> getTraerEstudiantes() {
        return traerEstudiantes;
    }

    public void setTraerEstudiantes(List<Estudiante> traerEstudiantes) {
        this.traerEstudiantes = traerEstudiantes;
    }

    public EstudianteDao getEstudiantedao() {
        return estudiantedao;
    }

    public void setEstudiantedao(EstudianteDao estudiantedao) {
        this.estudiantedao = estudiantedao;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Estudiante getEstudiantenuevo() {
        return estudiantenuevo;
    }

    public void setEstudiantenuevo(Estudiante estudiantenuevo) {
        this.estudiantenuevo = estudiantenuevo;
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

    public ArrayList<String> getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(ArrayList<String> tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public List<Estudiante> getBuscarEstudiantes() {
        return buscarEstudiantes;
    }

    public void setBuscarEstudiantes(List<Estudiante> buscarEstudiantes) {
        this.buscarEstudiantes = buscarEstudiantes;
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

    public Estudiante getEstudianteactualizar() {
        return estudianteactualizar;
    }

    public void setEstudianteactualizar(Estudiante estudianteactualizar) {
        this.estudianteactualizar = estudianteactualizar;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

}
