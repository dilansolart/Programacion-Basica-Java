// import Familia.Clase1;
// import Familia.Clase2;
// import Familia.Clase3;

import java.util.*;

import Componente_Practico.Calzado;
import Componente_Practico.PrendasDeVestir;

public class App {
    public static void main(String[] args) throws Exception {
        

    // Clase1 C1=new Clase1();
    // Clase2 C2=new Clase2();
    // Clase3 C3=new Clase3();

    // C1.imprimir();
    // System.out.println();
    // C2.imprimir();
    // System.out.println();
    // C2.metodo2();
    // System.out.println();
    // C3.imprimir();

    Scanner Entrada=new Scanner(System.in);
    int CantPrendas = Integer.parseInt(Entrada.nextLine().strip());
    int CantCalzado = Integer.parseInt(Entrada.nextLine().strip());
    PrendasDeVestir Vector1 [] = new PrendasDeVestir[CantPrendas];
    Calzado[] Vector2 = new Calzado[CantCalzado];
    

    String Codigo;
    String Descripcion;
    float PrecioCompra;
    float PrecioVenta;
    int CantBodega;
    int CantMinBodega;
    int CantMaxInventario;
    String Talla;
    char PermitePlanchado;
    int TallaCalzado;
    char opc;
    Calzado Y;
    PrendasDeVestir B;
    int StockMinimo;
    String Ct;

    for(int i=0; i<CantPrendas; i++){
        System.out.print("Digite Código: ");
        Codigo=Entrada.nextLine().strip();
        System.out.print("Digite Descripción: ");
        Descripcion=Entrada.nextLine().strip();
        System.out.print("Digite Precio de Compra: ");
        PrecioCompra=Float.parseFloat(Entrada.nextLine());
        System.out.print("Digite Precio de Venta: ");
        PrecioVenta=Float.parseFloat(Entrada.nextLine());
        System.out.print("Digite Cantidad en Bodega: ");
        CantBodega=Integer.parseInt(Entrada.nextLine());
        System.out.print("Digite Cantida mínima en Bodega: ");
        CantMinBodega=Integer.parseInt(Entrada.nextLine());
        System.out.print("Digite Cantidad máxima en inventario: ");
        CantMaxInventario=Integer.parseInt(Entrada.nextLine());
        System.out.print("Digite Talla: ");
        Talla=Entrada.nextLine().strip();
        System.out.print("Permite Planchado: ");
        PermitePlanchado=Entrada.nextLine().strip().toUpperCase().charAt(0);

        PrendasDeVestir P1= new PrendasDeVestir(Codigo,Descripcion,PrecioCompra,PrecioVenta,CantBodega,CantMinBodega,CantMaxInventario,Talla,PermitePlanchado);
        Vector1[i]=P1;
    }
    System.out.println("-------------------------");
    System.out.println("Calzado");
    for(int k=0; k<CantCalzado; k++){
        System.out.print("Digite Código: ");
        Codigo=Entrada.nextLine().strip();
        System.out.print("Digite Descripción: ");
        Descripcion=Entrada.nextLine().strip();
        System.out.print("Digite Precio de Compra: ");
        PrecioCompra=Float.parseFloat(Entrada.nextLine());
        System.out.print("Digite Precio de Venta: ");
        PrecioVenta=Float.parseFloat(Entrada.nextLine());
        System.out.print("Digite Cantidad en Bodega: ");
        CantBodega=Integer.parseInt(Entrada.nextLine());
        System.out.print("Digite Cantida mínima en Bodega: ");
        CantMinBodega=Integer.parseInt(Entrada.nextLine());
        System.out.print("Digite Cantidad máxima en inventario: ");
        CantMaxInventario=Integer.parseInt(Entrada.nextLine());
        System.out.print("Digite Talla Calzado: ");
        TallaCalzado=Integer.parseInt(Entrada.nextLine());
        

        Calzado P2= new Calzado(Codigo,Descripcion,PrecioCompra,PrecioVenta,CantBodega,CantMinBodega,CantMaxInventario,TallaCalzado);
        Vector2[k]=P2;
    }
    System.out.println("-------------------------");
    do{
        System.out.println("1. Verificar Productos a pedir");
        System.out.println("2. Calzado con mayor cantidad de unidades");
        System.out.println("3. Prenda con mayr cantidad de unidades");
        System.out.println("4. Modificar cantidad mínima requerida");
        System.out.println("5. Vender Producto");
        System.out.println("6. Consulta Producto");
        System.out.println("Digite opción: ");
        opc=Entrada.nextLine().strip().toUpperCase().charAt(0);
        switch(opc){
            case '1':
            // ●	Verificar productos a pedir: recorrer los vectores de productos y arrojar una
            //      alerta en caso tal se deba solicitar el pedido al proveedor.
            for(PrendasDeVestir X:Vector1){
                if (X != null && X.SolicitarPedido()){
                    System.out.println("Alerta, debe solicitar el producto con código: "+X.getCodigo());
                }
            }
            for(Calzado Q:Vector2){
                if (Q != null && Q.SolicitarPedido()){
                    System.out.println("Alerta, debe solicitar el producto con código: "+Q.getCodigo());
                }
            }
            break;
            case '2':
            // ●	Calzado con mayor cantidad de unidades: indicar cuál es el código del producto
            // que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen con la 
            // condición, indicar el primero de ellos.
            Y=Vector2[0];
            for (Calzado p: Vector2 ) 
                if ( Y.getCantBodega()<p.getCantBodega())
                Y=p;
                System.out.println("Calzado con mayor cantidad de existencias");
                System.out.println(Y.toString());
                 
            

            break;
            case '3':
            // ●	Prenda con mayor cantidad de unidades: indicar cuál es el código del producto 
            // que tiene mayor cantidad de unidades en bodega, si hay varios que cumplen con la
            //  condición, indicar el primero de ellos.
            B=Vector1[0];
            for (PrendasDeVestir m: Vector1 ) 
                if ( B.getCantBodega()<m.getCantBodega())
                B=m;
                System.out.println("Calzado con mayor cantidad de existencias");
                System.out.println(B.toString());
            break;
            case '4':
            // ●	Modificar cantidad mínima requerida en bodega: leer código de producto, 
            // el tipo (calzado o prenda) y el nuevo valor para la cantidad de unidades mínimas 
            // requeridas, validar en el método set de la variable correspondiente que la 
            // nueva cantidad no sea menor a 0, en caso de serlo establecer la cantidad mínima
            //  como 0.
            System.out.print("Digite Código del Producto: ");
            Codigo=Entrada.nextLine().strip();
            System.out.print("Nuevo stock mínimo: ");
            StockMinimo=Integer.parseInt(Entrada.nextLine().strip());
            System.out.print("Calzado o prenda: ");
            Ct=Entrada.nextLine().strip();

            if (Ct.equalsIgnoreCase("Calzado")){
            for(Calzado p:Vector2){
                if(p.getCodigo().equalsIgnoreCase(Codigo)){
                p.setCantMinBodega(StockMinimo);
                System.out.println(p.toString());
                break;

                }
            }

        }
            else if(Ct.equalsIgnoreCase("Prenda")){

                 

            for (PrendasDeVestir m:Vector1){
                if(m.getCodigo().equalsIgnoreCase(Codigo)){
                m.setCantMinBodega(StockMinimo);
                System.out.println(m.toString());
                break;
            
                }
            }

        }
            break;
            case '5':
            // ●	Vender producto: solicite el código de un producto a vender, el tipo 
            // (calzado o prenda), y las unidades correspondientes, calcule el valor de la
            //  factura con descuento y sin descuento. Validar que existan las unidades 
            //  necesarias para la venta y modificar las unidades existentes después de la 
            //  venta utilizando el método set de la variable correspondiente.

            System.out.print("Digite Código del Producto: ");
            Codigo=Entrada.nextLine().strip();
            System.out.print("Calzado o prenda: ");
            Ct=Entrada.nextLine().strip();
            System.out.print("Cantidad unidades: ");
            StockMinimo=Integer.parseInt(Entrada.nextLine().strip());


            if (Ct.equalsIgnoreCase("Calzado"))
            for(Calzado c:Vector2)
                if(c.getCodigo().equalsIgnoreCase(Codigo))
                    if (c.getCantBodega()>StockMinimo)
                    c.TotalPagar(StockMinimo);


            if (Ct.equalsIgnoreCase("Prenda"))
            for(PrendasDeVestir d:Vector1)
                if(d.getCodigo().equalsIgnoreCase(Codigo))
                    if (d.getCantBodega()>StockMinimo)
                    d.TotalPagar(StockMinimo);

            

            break;
            // ●	Consultar producto: solicite el código de un producto a vender, el tipo (calzado o prenda)
            //  y muestre la información del mismo
            case '6':
            System.out.print("Digite Código del Producto: ");
            Codigo=Entrada.nextLine().strip();
            System.out.print("Calzado o prenda: ");
            Ct=Entrada.nextLine().strip();
            if (Ct.equalsIgnoreCase("Calzado")) {
                for(Calzado c : Vector2) {
                    if (c.getCodigo().equalsIgnoreCase(Codigo)) {
                        System.out.println(c.mostrar());
                        break;
                    }
                }
            } else if (Ct.equalsIgnoreCase("Prenda")) {
                for(PrendasDeVestir p : Vector1) {
                    if (p.getCodigo().equalsIgnoreCase(Codigo)) {
                        System.out.println(p.mostrar());
                        break;
                    }
                }
            }
            break;
            default:
            System.out.println("Opción no valida");
            break;
            }

        }
        while (opc !='S');


    }

        
    }
    
    
    




