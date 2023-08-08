package materiales;

import java.util.Date;


public class Compras {
    private String proveedor;
    private int NoFactura;
    private String CodigoProducto;
    private String NombreProducto;
    private Double precio;
    private int cantidad;
    private Date fecha; 
    private Double total;

    public Compras(String proveedor, int NoFactura, String CodigoProducto, String NombreProducto, Double precio, int cantidad, Date fecha, Double total) {
        this.proveedor = proveedor;
        this.NoFactura = NoFactura;
        this.CodigoProducto = CodigoProducto;
        this.NombreProducto = NombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNoFactura() {
        return NoFactura;
    }

    public void setNoFactura(int NoFactura) {
        this.NoFactura = NoFactura;
    }

    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(String CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
