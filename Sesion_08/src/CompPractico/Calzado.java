package CompPractico;

public class Calzado extends Producto {
    private int talla;

    public Calzado() {
    }

    public Calzado(String codigo, String descripcion, float precioCompra, float precioVenta, int cantidadBodega,
            int cantidadMinBodega, int cantidadMaxInventario, int talla) {
        super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinBodega, cantidadMaxInventario);
        this.talla = talla;
    }
   
    
}
