package Componente_Practico;

public class Producto {
    private String Codigo;
    private String Descripcion;
    private float PrecioCompra;
    private float PrecioVenta;
    private int CantBodega;
    private int CantMinBodega;
    private int CantMaxInventario;
    private static float PorcentajeDescuento=0.01f;

    public Producto(){

    }

    

    public Producto(String codigo, String descripcion, float precioCompra, float precioVenta, int cantBodega,
            int cantMinBodega, int cantMaxInventario) {
        Codigo = codigo;
        Descripcion = descripcion;
        PrecioCompra = precioCompra;
        PrecioVenta = precioVenta;
        CantBodega = cantBodega;
        CantMinBodega = cantMinBodega;
        CantMaxInventario = cantMaxInventario;
    }



    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public float getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        PrecioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        PrecioVenta = precioVenta;
    }

    public int getCantBodega() {
        return CantBodega;
    }

    public void setCantBodega(int cantBodega) {
        CantBodega = cantBodega;
    }

    public int getCantMinBodega() {
        return CantMinBodega;
    }

    public void setCantMinBodega(int cantMinBodega) {
        if(cantMinBodega<0)
        cantMinBodega=0;
        this.CantMinBodega = cantMinBodega;
    }

    public int getCantMaxInventario() {
        return CantMaxInventario;
    }

    public void setCantMaxInventario(int cantMaxInventario) {
        CantMaxInventario = cantMaxInventario;
    }

    public static float getPorcentajeDescuento() {
        return PorcentajeDescuento;
    }

    public static void setPorcentajeDescuento(float porcentajeDescuento) {
        PorcentajeDescuento = porcentajeDescuento;
    }

   

    public Boolean SolicitarPedido(){
        return CantBodega<CantMinBodega;
    }

    public float TotalPagar(int Cantidad){
        return Cantidad*PrecioCompra;

    }

    public String toString(){
        return String.format("%s %s %f %f %d %d %d",Codigo,Descripcion, PrecioCompra, PrecioVenta, CantBodega, CantMinBodega, CantMaxInventario);
    }

    public String mostrar() {
        return String.format("%s %s %f %f %d %d %d",this.Codigo, this.Descripcion, this.PrecioCompra, this.PrecioVenta, this.CantBodega, this.CantMinBodega, this.CantMaxInventario);
    }

}
