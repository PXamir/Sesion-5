package entidades;

/* @author SAMIR */
public class PERSONA {
    
    String nombre;
    String apellido;
    String dni;

    public PERSONA() {}

    public PERSONA(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getText(){
      
     return "PERSONA: " + this.nombre + " " + this.apellido;
    }
  
    
}
