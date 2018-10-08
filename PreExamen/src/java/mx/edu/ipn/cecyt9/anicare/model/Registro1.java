package mx.edu.ipn.cecyt9.anicare.model;

import java.io.Serializable;

public class Registro1 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nombre;
    private String contraseña;

    public Registro1() {
    }

    public Registro1(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Registro1)) {
            return false;
        }
        Registro1 other = (Registro1) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.anicare.model.Registro1[ nombre=" + nombre + " ]";
    }
    
}
