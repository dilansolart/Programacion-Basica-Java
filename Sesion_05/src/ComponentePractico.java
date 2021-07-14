import java.util.*;

public class ComponentePractico {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese cantidad de productos a manejas: ");
        int n = input.nextInt();
        Producto [] p1 = new Producto [n];
        
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
        input.close();
        int menor = p1[0].CantidadBodega;
        for (int j = 0; j < n; j++) {
            if (p1[j].solicitarPedido()) {
                System.out.printf("Alert! --> Solucitar pedido al proveedor. Cod. Producto #%d%n", p1[j].Codigo);
            }
            if (p1[j].CantidadBodega < menor) {
                menor = p1[j].CantidadBodega;
                System.out.printf("El producto con menor cantidad de unidades en bodega tiene codigo #%d", p1[j].Codigo);
            }

        }


        input.close();
    }
}
