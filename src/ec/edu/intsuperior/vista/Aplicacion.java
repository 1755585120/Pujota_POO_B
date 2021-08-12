
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

public class Aplicacion {
    
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        Persona p1 = new Persona();
        
        c1.getTelefono("0987491676");
        p1.getNombre("Scarleth");
        p1.getEdad("2");
        
        System.out.println(c1.toString());
        System.out.println(p1.toString());
        
    }
}
