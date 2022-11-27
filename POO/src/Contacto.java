
public class Contacto {
    private String identificacion;
    private String nombre;
    private String apellidos;
    
    public Contacto(String identificacion, String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    
    
}


