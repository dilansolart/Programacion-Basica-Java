public class Producto {
    private Integer Codigo;
    private Integer PrecioCom;
    private Integer CantidadBodega;
    private Integer CantidadStock;
    private Integer CantMax;
    private static final float Desc = 0.99f;

    public Producto (int codigo, int precioCom, int cantidadBodega, int cantidadStock) {
        this.Codigo = codigo;
        this.PrecioCom = precioCom;
        this.CantidadBodega = cantidadBodega;
        this.CantidadStock = cantidadStock;
        //this.CantMax = cantMax;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }

    public Integer getPrecioCom() {
        return PrecioCom;
    }

    public void setPrecioCom(Integer precioCom) {
        PrecioCom = precioCom;
    }

    public Integer getCantidadBodega() {
        return CantidadBodega;
    }

    public void setCantidadBodega(Integer cantidadBodega) {
        CantidadBodega = cantidadBodega;
    }

    public Integer getCantidadStock() {
        return CantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        CantidadStock = cantidadStock;
    }

    public Integer getCantMax() {
        return CantMax;
    }

    public void setCantMax(Integer cantMax) {
        CantMax = cantMax;
    }

    public static float getDesc() {
        return Desc;
    }

    public Boolean solicitarPedido () {
        return (this.CantidadBodega < this.CantidadStock);
    }

    public float totalPagar(int cantComprar) {
        float total = 0;
        total = cantComprar * this.PrecioCom;
        return total;
    }
}
