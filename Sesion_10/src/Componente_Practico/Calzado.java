package Componente_Practico;

public class Calzado extends Producto{
    
    private int TallaCalzado;

    public Calzado(){

    }

    

    public Calzado(String codigo, String descripcion, float precioCompra, float precioVenta, int cantBodega,
            int cantMinBodega, int cantMaxInventario, int talla) {
        super(codigo, descripcion, precioCompra, precioVenta, cantBodega, cantMinBodega, cantMaxInventario);
        TallaCalzado = talla;
    }



    @Override
    public String mostrar() {
        // TODO Auto-generated method stub
        return String.format("%s %d", super.mostrar(), this.TallaCalzado);
    }

    
    



    

}
