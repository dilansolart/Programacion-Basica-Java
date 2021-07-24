import java.util.Scanner;

import Familia.*;
import CompPractico.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Clase1 c1 = new Clase1();
        // Clase2 c2 = new Clase2();
        // Clase3 c3 = new Clase3();
        // // c1.imprimir();
        // // c2.imprimir();
        // c3.imprimir();
        Scanner input = new Scanner(System.in);
        int cantPrendas = Integer.parseInt(input.nextLine().strip());
        int cantCalzado = Integer.parseInt(input.nextLine().strip());
        PrendasDeVestir vector1 [] = new PrendasDeVestir [cantPrendas];
        Calzado vector2 [] = new Calzado [cantCalzado];
        String codigo, descripcion, tallaPrenda;
        float precioCompra, precioVenta;
        int cantidadBodega, cantidadMinBodega, cantidadMaxInventario, tallaCalzado;
        char permitePlanchar, opc;
        for (int i = 0; i < cantPrendas; i++) {
            System.out.println("Digite Codigo: ");
            codigo = input.nextLine();
            System.out.println("Digite Descripcion: ");
            descripcion = input.nextLine();
            System.out.println("Digite precio de compra: ");
            precioCompra = input.nextFloat();
            System.out.println("Digite precio de venta: ");
            precioVenta = input.nextFloat();
            System.out.println("Digite cant. bodega: ");
            cantidadBodega = input.nextInt();
            System.out.println("Digite cant. Minima bodega: ");
            cantidadMinBodega = input.nextInt();
            System.out.println("Digite cant. Maxima Inventario: ");
            cantidadMaxInventario = input.nextInt();
            System.out.println("Digite talla: ");
            tallaPrenda = input.nextLine();
            System.out.println("Digite permite planchar: S/N");
            permitePlanchar = input.nextLine().strip().toUpperCase().charAt(0);
            PrendasDeVestir p1 = new PrendasDeVestir (codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinBodega, cantidadMaxInventario, tallaPrenda, permitePlanchar = 'S');
            vector1[i] = p1;
        }

        for (int i = 0; i < cantCalzado; i++) {
            System.out.println("Digite Codigo: ");
            codigo = input.nextLine();
            System.out.println("Digite Descripcion: ");
            descripcion = input.nextLine();
            System.out.println("Digite precio de compra: ");
            precioCompra = input.nextFloat();
            System.out.println("Digite precio de venta: ");
            precioVenta = input.nextFloat();
            System.out.println("Digite cant. bodega: ");
            cantidadBodega = input.nextInt();
            System.out.println("Digite cant. Minima bodega: ");
            cantidadMinBodega = input.nextInt();
            System.out.println("Digite cant. Maxima Inventario: ");
            cantidadMaxInventario = input.nextInt();
            System.out.println("Digite talla: ");
            tallaCalzado = input.nextInt();
            Calzado p2 = new Calzado(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinBodega, cantidadMaxInventario, tallaCalzado);
            vector2[i] = p2;
        }

        do {
            System.out.println("1. Verificar Productos a pedir");
            System.out.println("2. Calzado con mayor cantidad de unidades");
            System.out.println("3. Prenda con mayor cantidad de unidades");
            System.out.println("4. Modificar cantidad mínima requerida en bodega");
            System.out.println("5. Vender producto");
            System.out.println("Digite Opcion: ");
            opc = input.nextLine().strip().toUpperCase().charAt(0);
            switch (opc) {
                case '1':
        
                default:
                    break;
            }
        } while (opc != 'S');

        input.close();
        // Implemente en la clase principal un menú con las siguientes opciones:
        // ●	Verificar productos a pedir: recorrer los vectores de productos y arrojar una alerta en caso tal se deba solicitar el pedido al proveedor.
        // ●	Calzado con mayor cantidad de unidades: indicar cuál es el código del producto que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos.
        // ●	Prenda con mayor cantidad de unidades: indicar cuál es el código del producto que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen con la condición, indicar el primero de ellos.
        // ●	Modificar cantidad mínima requerida en bodega: leer código de producto, el tipo (calzado o prenda) y el nuevo valor para la cantidad de unidades mínimas requeridas, validar en el método set de la variable correspondiente que la nueva cantidad no sea menor a 0, en caso de serlo establecer la cantidad mínima como 0.
        // ●	Vender producto: solicite el código de un producto a vender, el tipo (calzado o prenda), y las unidades correspondientes, calcule el valor de la factura con descuento y sin descuento. Validar que existan las unidades necesarias para la venta y modificar las unidades existentes después de la venta utilizando el método set de la variable correspondiente.


    }
}
