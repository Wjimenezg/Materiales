package materiales;


public class Tiendas {
    private String Direccion;
    private String inventario;

    public Tiendas(String Direccion, String inventario) {
        this.Direccion = Direccion;
        this.inventario = inventario;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }
    
    
}
