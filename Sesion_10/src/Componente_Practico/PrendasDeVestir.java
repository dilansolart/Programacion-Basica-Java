package Componente_Practico;

public class PrendasDeVestir extends Producto{

    private String Talla;
    private char PermitePlanchado;

    public PrendasDeVestir(){

    }
    

    public PrendasDeVestir(String codigo, String descripcion, float precioCompra, float precioVenta, int cantBodega,
            int cantMinBodega, int cantMaxInventario, String talla, char permitePlanchado) {
        super(codigo, descripcion, precioCompra, precioVenta, cantBodega, cantMinBodega, cantMaxInventario);
        Talla = talla;
        PermitePlanchado = permitePlanchado;
    }


    @Override
    public String mostrar() {
        // TODO Auto-generated method stub
        return String.format("%s %s %c", super.mostrar(), this.Talla, this.PermitePlanchado); 
    }

    
    
    
    
    


    
}
