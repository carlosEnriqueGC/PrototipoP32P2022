package seguridad.controlador;

public class clsTipoUsuarios {
    private int tipousuid;
    private String tipousunombre;
   

    public clsTipoUsuarios() {
    }

    public clsTipoUsuarios(int tipousuid) {
        this.tipousuid = tipousuid;
    }
    
    public clsTipoUsuarios(String tipousunombre) {
        this.tipousunombre = tipousunombre;
      
    }
    
    public clsTipoUsuarios(int tipousuid, String tipousunombre) {
        this.tipousuid = tipousuid;
        this.tipousunombre = tipousunombre;
       
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTipousuid() {
        return tipousuid;
    }

    public void setTipousuid(int tipousuid) {
        this.tipousuid = tipousuid;
    }

    public String getTipousunombre() {
        return tipousunombre;
    }

    public void setTipousunombre(String tipousunombre) {
        this.tipousunombre = tipousunombre;
    }
}

   