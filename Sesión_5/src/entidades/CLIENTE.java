package entidades;

/* @author SAMIR */
public class CLIENTE extends PERSONA{
    
    private String cod_cliente;
    
    ////proceso para convertir padre a hija... or something like that
    public static CLIENTE fromPERSONA(PERSONA per){
            CLIENTE cli = new CLIENTE();
            cli.setNombre(per.getNombre());
            cli.setApellido(per.getApellido());
            cli.setDni(per.getDni());
    
        return cli;
}

    public CLIENTE() {}

    public CLIENTE(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
   
    @Override
    public String getText(){
    
        return "CLIENTE      : " + this.getNombre() + " " + this.apellido + "| CLI   " + this.dni ;
}
}
