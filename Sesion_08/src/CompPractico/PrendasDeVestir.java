package CompPractico;

public class PrendasDeVestir extends Producto{
    private String talla;
    private char permitePlanchar;

    public PrendasDeVestir() {
    }

    public PrendasDeVestir(String codigo, String descripcion, float precioCompra, float precioVenta, int cantidadBodega,
            int cantidadMinBodega, int cantidadMaxInventario, String talla, char permitePlanchar) {
        super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinBodega, cantidadMaxInventario);
        this.talla = talla;
        this.permitePlanchar = permitePlanchar;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public char getPermitePlanchar() {
        return permitePlanchar;
    }

    public void setPermitePlanchar(char permitePlanchar) {
        this.permitePlanchar = permitePlanchar;
    }
  

}
