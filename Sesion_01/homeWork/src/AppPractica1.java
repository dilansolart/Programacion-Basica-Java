import java.util.Scanner;

public class AppPractica1 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese cantidad en bodega: ");
        int cantidadB = leer.nextInt();
        System.out.print("Ingrese cantidad en bodega: ");
        int cantidadMin = leer.nextInt();
        if (cantidadB < cantidadMin) {
            System.out.println("no es necesario realizar el pedido al proveedor");
        } else {
            System.out.println("realizar el pedido al proveedor");
        }
    }
}
