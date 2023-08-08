
package materiales;

public class Bodega {
   private String Direccion;
   private String Capacidad;
   private String Tipo_Producto;

    public Bodega(String Direccion, String Capacidad, String Tipo_Producto) {
        this.Direccion = Direccion;
        this.Capacidad = Capacidad;
        this.Tipo_Producto = Tipo_Producto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getTipo_Producto() {
        return Tipo_Producto;
    }

    public void setTipo_Producto(String Tipo_Producto) {
        this.Tipo_Producto = Tipo_Producto;
    }
   
    
   
}
