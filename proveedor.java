package materiales;


public class proveedor {
    private String tipo_Producto;
    private int NoFactura;

    public proveedor(String tipo_Producto, int NoFactura) {
        this.tipo_Producto = tipo_Producto;
        this.NoFactura = NoFactura;
    }

    public String getTipo_Producto() {
        return tipo_Producto;
    }

    public void setTipo_Producto(String tipo_Producto) {
        this.tipo_Producto = tipo_Producto;
    }

    public int getNoFactura() {
        return NoFactura;
    }

    public void setNoFactura(int NoFactura) {
        this.NoFactura = NoFactura;
    }
    
    
    
}
