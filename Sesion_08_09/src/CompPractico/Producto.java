package CompPractico;

public class Producto {
    private String codigo;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private int cantidadBodega;
    private int cantidadMinBodega;
    private int cantidadMaxInventario;
    private static float porcentajeDescuento = 0.01f;

    
    public Producto() {
    }

    

    public Producto(String codigo, String descripcion, float precioCompra, float precioVenta, int cantidadBodega,
            int cantidadMinBodega, int cantidadMaxInventario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinBodega = cantidadMinBodega;
        this.cantidadMaxInventario = cantidadMaxInventario;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public float getPrecioCompra() {
        return precioCompra;
    }



    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }



    public float getPrecioVenta() {
        return precioVenta;
    }



    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }



    public int getCantidadBodega() {
        return cantidadBodega;
    }



    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }



    public int getCantidadMinBodega() {
        return cantidadMinBodega;
    }



    public void setCantidadMinBodega(int cantidadMinBodega) {
        this.cantidadMinBodega = cantidadMinBodega;
    }



    public int getCantidadMaxInventario() {
        return cantidadMaxInventario;
    }



    public void setCantidadMaxInventario(int cantidadMaxInventario) {
        this.cantidadMaxInventario = cantidadMaxInventario;
    }



    public static float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }



    public static void setPorcentajeDescuento(float porcentajeDescuento) {
        Producto.porcentajeDescuento = porcentajeDescuento;
    }



    public Boolean solicitarPedido () {
        return cantidadBodega < cantidadMinBodega;
    }
    public float totalPagar (int cantidad) {
        return cantidad * this.precioCompra;
    }

}
