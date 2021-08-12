
package ec.edu.intsuperior.modelo;

import javax.swing.JOptionPane;

public class Persona {
    
    private String nombre;
    private Integer edad;

    public Persona() {
        
        JOptionPane.showMessageDialog(null,"Se a creado un objeto de la clase persona");
        
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre: "+ getNombre()+ "\n"
                + "edad" +getEdad();
    }

    public void getNombre(String scarleth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getEdad(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
