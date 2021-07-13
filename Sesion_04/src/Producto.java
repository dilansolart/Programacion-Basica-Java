public class Producto {
    public Integer Codigo;
    public Integer PrecioCom;
    public Integer CantidadBodega;
    public Integer CantidadStock;

    public Producto (int codigo, int precioCom, int cantidadBodega, int cantidadStock) {
        this.Codigo = codigo;
        this.PrecioCom = precioCom;
        this.CantidadBodega = cantidadBodega;
        this.CantidadStock = cantidadStock;
    }

    public Boolean solicitarPedido () {
        return (this.CantidadBodega < this.CantidadStock);
    }
}
