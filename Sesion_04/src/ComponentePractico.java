import java.util.Scanner;

public class ComponentePractico {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int codeProducto, precio, cantBodega, cantStock;
        System.out.print("Codigo del producto: ");
        codeProducto = input.nextInt();
        System.out.print("Precio de compra: ");
        precio = input.nextInt();
        System.out.print("Cantidad en bodega: ");
        cantBodega = input.nextInt();
        System.out.print("Cantidad minima requerida en bodega: ");
        cantStock = input.nextInt();
        input.close();
        Producto p1 = new Producto(codeProducto, precio, cantBodega, cantStock);
        // p1.Codigo = codeProducto;
        // p1.PrecioCom = precio;
        // p1.CantidadBodega = cantBodega;;
        // p1.CantidadStock = cantStock;
        if (p1.solicitarPedido()) System.out.println("Alert! --> Solucitar pedido al proveedor :)");
    }
}