package seguridad.controlador;

public class clsEmpleados {
    private int emplid;
    private String emplnombre;
    private String emplapellidos;
    private String empldireccion;
    private String emplTipoUsu;
    private String emplnacimiento;
    private String empldpi;
 
    public clsEmpleados() {
    }

    public clsEmpleados(int emplid) {
        this.emplid = usuid;
    }
    
    public clsEmpleados(String emplnombre, String emplapelliddos, String empldireccion) {
        this.usunombre = usunombre;
        this.usucontrasena = usucontrasena;
        this.tipousu = tipousu;
    }
    
    public clsUsuario(int usuid, String usunombre, String usucontrasena, String tipousu) {
        this.usuid = usuid;
        this.usunombre = usunombre;
        this.usucontrasena = usucontrasena;
        this.tipousu = tipousu;
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getUsuid() {
        return usuid;
    }

    public void setUsuid(int usuid) {
        this.usuid = usuid;
    }

    public String getUsunombre() {
        return usunombre;
    }

    public void setUsunombre(String usunombre) {
        this.usunombre = usunombre;
    }

    public String getUsucontrasena() {
        return usucontrasena;
    }

    public void setUsucontrasena(String usucontrasena) {
        this.usucontrasena = usucontrasena;
    }
    
    public String gettipousu() {
        return tipousu;
    }

    public void settipousu(String tipousu) {
        this.tipousu = tipousu;
    }

}
