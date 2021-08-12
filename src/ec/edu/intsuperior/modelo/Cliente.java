
package ec.edu.intsuperior.modelo;

public class Cliente {
    
    private String telefono;

    public Cliente() {
    }

    public Cliente(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void getTelefono(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
