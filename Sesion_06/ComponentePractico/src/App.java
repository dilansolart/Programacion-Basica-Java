import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese cantidad de productos a manejas: ");
        int n = input.nextInt();
        Producto [] p1 = new Producto [n];
        int cod, cCompra;
        
        for (int i = 0; i < n; i++) {
            int codeProducto, precio, cantBodega, cantStock;
            System.out.print("Codigo del producto: ");
            codeProducto = input.nextInt();
            System.out.print("Precio de compra: ");
            precio = input.nextInt();
            System.out.print("Cantidad en bodega: ");
            cantBodega = input.nextInt();
            System.out.print("Cantidad minima requerida en bodega: ");
            cantStock = input.nextInt();
            p1[i] = new Producto(codeProducto, precio, cantBodega, cantStock);
            
        }
        
        int mayor = p1[0].getCantidadBodega();
        for (int j = 0; j < n; j++) {
            if (p1[j].solicitarPedido()) {
                System.out.printf("Alert! --> Solucitar pedido al proveedor. Cod. Producto #%d%n", p1[j].getCodigo());
            }
            if (p1[j].getCantidadBodega() > mayor) {
                mayor = p1[j].getCantidadBodega();
                System.out.printf("El producto con mayor cantidad de unidades en bodega tiene codigo #%d%n", p1[j].getCodigo());
            }
            
        }

        System.out.print("Ingrese codigo de producto para compra: ");
        cod = input.nextInt();
        System.out.print("Cantidad de unidades a comprar: ");
        cCompra = input.nextInt();
        input.close();
        for (int j = 0; j < n; j++) {
            if (p1[j].getCodigo() == cod) {
                System.out.printf("El total a pagar por la compra es: %.2f", p1[j].totalPagar(cCompra));
            }
        }
    }
}
