package entidades;

/* @author SAMIR */
public class EMPLEADO extends PERSONA{
    
    private String cod_empleado;
    
    
    //proceso para convertir padre a hija... or something like that
    public static EMPLEADO fromPERSONA(PERSONA per){
            EMPLEADO emp = new EMPLEADO();
            emp.setNombre(per.getNombre());
            emp.setApellido(per.getApellido());
            emp.setDni(per.getDni());
    
        return emp;
    }

    public EMPLEADO() {}

    public EMPLEADO(String cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(String cod_empleado) {
        this.cod_empleado = cod_empleado;
    }
    
    @Override
    public String getText(){
    
        return "EMPLEADO: " + this.getNombre() + " " + this.apellido + "| EMP " + this.dni ;
}
            
    
}
