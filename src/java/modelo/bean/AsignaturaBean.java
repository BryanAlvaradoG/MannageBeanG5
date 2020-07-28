/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author Kathe
 */
@Named(value = "asignaturaBean")
@RequestScoped
public class AsignaturaBean {

    private String Asignatura;
    private String Docente[];
    private String Carrera;
    private String Ciclo;
    
    
     public AsignaturaBean() {
        
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public String[] getDocente() {
        return Docente;
    }

    public void setDocente(String[] Docente) {
        this.Docente = Docente;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

   
}
