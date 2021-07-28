import java.util.ArrayList;
import java.util.Scanner;
import ComponentePractico.*;

public class App {
	
	private static int select = -1; //opci�n elegida del usuario
	private static ArrayList<PrendaVestir> listaPrendaVestir = new ArrayList<>();  //arreglo donde se guardara las prendas a vestir
	private static ArrayList<Calzado> listaCalzado = new ArrayList<>();   //arreglo donde se guardara los calzados

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numPrendasVestir = entrada.nextInt();
		int numCalzado = entrada.nextInt();
		
		for (int i = 0; i < numPrendasVestir; i++) {
			entrada.nextLine();
			PrendaVestir pv = new PrendaVestir();
			System.out.println("digite codigo pv: ");
			pv.setCodigo(entrada.nextLine());
			System.out.println("digite descripcion pv: ");
			pv.setDescripcion(entrada.nextLine());
			System.out.println("digite precio compra pv: ");
			pv.setPrecioCompra(entrada.nextFloat());
			System.out.println("digite precio venta pv: ");
			pv.setPrecioVenta(entrada.nextFloat());
			System.out.println("digite cantidad en bodega pv: ");
			pv.setCantidadBodega(entrada.nextInt());
			System.out.println("digite cantidad minima requerida en bodega pv: ");
			pv.setCantidadMinimaBodega(entrada.nextInt());
			System.out.println("digite cantidad maxima inventario permitida pv: ");
			pv.setCantidadMaximaInventario(entrada.nextInt());
			System.out.println("digite talla pv: ");
			pv.setTalla(entrada.next());
			System.out.println("digite permite planchar pv: ");
			pv.setPermitePlanchado(entrada.next().strip().toUpperCase().charAt(0));
			
			listaPrendaVestir.add(pv);
		}
		
		for (int i = 0; i < numCalzado; i++) {
			entrada.nextLine();
			Calzado c = new Calzado();
			System.out.println("digite codigo c: ");
			c.setCodigo(entrada.nextLine());
			System.out.println("digite descripcion c: ");
			c.setDescripcion(entrada.nextLine());
			System.out.println("digite precio compra c: ");
			c.setPrecioCompra(entrada.nextFloat());
			System.out.println("digite precio venta c: ");
			c.setPrecioVenta(entrada.nextFloat());
			System.out.println("digite cantidad en bodega c: ");
			c.setCantidadBodega(entrada.nextInt());
			System.out.println("digite cantidad minima requerida en bodega c: ");
			c.setCantidadMinimaBodega(entrada.nextInt());
			System.out.println("digite cantidad maxima inventario permitida c: ");
			c.setCantidadMaximaInventario(entrada.nextInt());
			System.out.println("digite talla c: ");
			c.setTalla(entrada.nextInt());
			
			listaCalzado.add(c);
		}
		
		while(select != 0){
			//Try catch para evitar que el programa termine si hay un error
			try{
				System.out.println("Elige opci�n:\n1.- Verificar productos a pedir" +
						"\n2.- Calzado con mayor cantidad de unidades\n" +
						"3.- Prenda con mayor cantidad de unidades\n" +
						"4.- Modificar cantidad minimam requerida en bodega\n" +
						"5.- Vender Producto\n" +
						"0.- Salir");
				//Recoger una variable por consola
				//select = Integer.parseInt(entrada.nextLine()); 
				select = entrada.nextInt();
	
				switch(select){
				case 1: 
					System.out.println("opcion 1\n");
					verificarProductosPedir();
					//System.out.println(listaPrendaVestir.get(0).isPermitePlanchado()); 
					break;
				case 2: 
					System.out.println("opcion 2");
					calzadoMayorCantidadUnidades();
					//System.out.println(listaCalzado.get(0).getTalla());
					break;
				case 3: 
					System.out.println("opcion 3");
					prendaMayorCantidadUnidades();
					break;
				case 4:
					System.out.println("opcion 4");
					System.out.print("digita codigo a buscar: ");
					String codigo = entrada.next().strip();
					System.out.print("digita tipo de producto (calzado o prenda): ");
					String tipoProducto = entrada.next().toLowerCase().strip();
					modificarCantidadMinimaBodega(codigo, tipoProducto);
					break;
				case 5:
					System.out.println("opcion 5");
					System.out.print("digita codigo producto para la venta: ");
					String codigoVenta = entrada.next().strip();
					System.out.print("digita tipo de producto (calzado o prenda): ");
					String tipoProductoVenta = entrada.next().toLowerCase().strip();
					venderProducto(codigoVenta, tipoProductoVenta);
					break;
				case 0: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("N�mero no reconocido");break;
				}
				
				System.out.println("\n"); //salto de l�nea en Java
				
			}catch(Exception e){
				System.out.println("Uoop! Error!");
				e.printStackTrace(System.out);
			}
		}

	}
	
	/**
	 * method verificarProductosPedir
	 * metodo que recorre los vectores de productos y arroja una alerta en caso tal se deba solicitar el pedido al proveedor
	 */
	public static void verificarProductosPedir(){ 
		for (int i = 0; i < listaPrendaVestir.size(); i++) {
			PrendaVestir prendaVestir = listaPrendaVestir.get(i);
			if (prendaVestir.solicitarPedido() == true) {
				System.out.println("Alerta: solicitar el pedido al proveedor prenda de vestir, PRODUCTO AGOTADO"+ " - codigo: "+prendaVestir.getCodigo() + " descripcion: " +prendaVestir.getDescripcion() + " cantBodega: "+prendaVestir.getCantidadBodega() +"cantMinimaBodega: "+ prendaVestir.getCantidadMinimaBodega());
			}
		}
		
		for (int i = 0; i < listaCalzado.size(); i++) {
			Calzado calzado = listaCalzado.get(i);
			if (calzado.solicitarPedido() == true) {
				System.out.println("Alerta: solicitar el pedido al proveedor de calzado, PRODUCTO AGOTADO"+ " - codigo: "+calzado.getCodigo() + " descripcion: " +calzado.getDescripcion() + " cantBodega: "+calzado.getCantidadBodega() +"cantMinimaBodega: "+ calzado.getCantidadMinimaBodega());
			}
		}
		
//		for (PrendaVestir prenVestir : listaPrendaVestir) {
//			
//			if (prenVestir.solicitarPedido() == true) {
//				String code = prenVestir.getCodigo();
//				String description = prenVestir.getDescripcion();
//				int cb =  prenVestir.getCantidadBodega();
//				int cmb = prenVestir.getCantidadMinimaBodega();
//				
//				System.out.println("Alerta: solicitar el pedido al proveedor, PRODUCTO AGOTADO"+ " - codigo: "+code + " descripcion: " +description + " cantBodega: "+ cb +"cantMinimaBodega+ "+ cmb);
//			}
//			
//		}
		
	}
	
	/**
	 * method calzadoMayorCantidadUnidades
	 * indica cu�l es el c�digo del producto que tiene mayor cantidad de unidades en bodega, 
	 * si hay varios que cumplen con la condici�n, indica el primero de ellos.
	 */
	public static void calzadoMayorCantidadUnidades(){
		
		int mayor = listaCalzado.get(0).getCantidadBodega();
		ArrayList<Calzado> objetoListaCalzado = new ArrayList<>();
		for (int i = 1; i < listaCalzado.size(); i++) {
			Calzado calzado = listaCalzado.get(i);
			if (calzado.getCantidadBodega() >= mayor) {
				
				calzado.getCodigo();
				objetoListaCalzado.add(calzado);
			}
		}
		
		System.out.println("Codigo de calzado con mayor cantidad de unidades: " + objetoListaCalzado.get(0).getCodigo());
		
	}
	
	/**
	 * method prendaMayorCantidadUnidades
	 * indica cu�l es el c�digo del producto que tiene mayor cantidad de unidades en bodega, 
	 * si hay varios que cumplen con la condici�n, indica el primero de ellos. 
	 */
	public static void prendaMayorCantidadUnidades(){
		
		int mayor = listaPrendaVestir.get(0).getCantidadBodega();
		ArrayList<PrendaVestir> objetoListaPrendaVestir = new ArrayList<>();
		for (int i = 1; i < listaPrendaVestir.size(); i++) {
			PrendaVestir prendaVestir = listaPrendaVestir.get(i);
			if (prendaVestir.getCantidadBodega() >= mayor) {
				
				prendaVestir.getCodigo();
				objetoListaPrendaVestir.add(prendaVestir);
			}
		}
		
		System.out.println("Codigo de prenda con mayor cantidad de unidades: " + objetoListaPrendaVestir.get(0).getCodigo());
		
	}
	
	/**
	 * method modificarCantidadMinimaBodega
	 * leer c�digo de producto, el tipo (calzado o prenda) y el nuevo valor para la cantidad de unidades m�nimas requeridas, 
	 * validar en el m�todo set de la variable correspondiente que la nueva cantidad no sea menor a 0, 
	 * en caso de serlo establecer la cantidad m�nima como 0.
	 * @param codigo, tipoProducto
	 */
	@SuppressWarnings("resource")
	public static void modificarCantidadMinimaBodega(String codigo, String tipoProducto){
		Scanner entradaDos = new Scanner(System.in);
		if (tipoProducto.trim().equals("prenda")) {
			int contadorPrenda = 0;
			for (int i = 0; i < listaPrendaVestir.size(); i++) {
				PrendaVestir prendaVestir = listaPrendaVestir.get(i);
				if (prendaVestir.getCodigo().equals(codigo)) {
					System.out.println("la cantidad minima en bodega actual es: "+ prendaVestir.getCantidadMinimaBodega());
					System.out.println("digite cantidad minima en bodega a actualizar:");
					int cmbPrenda = entradaDos.nextInt();
					if(cmbPrenda > 0) {
						prendaVestir.setCantidadMinimaBodega(cmbPrenda);
					}else {
						prendaVestir.setCantidadMinimaBodega(0);
						System.out.println("el valor digitado incumple con la validacion o es igual a cero - cantidad minima requerida sera CERO");
					}
				}else {
					contadorPrenda +=1;
				}
			}
			
			if (contadorPrenda == listaPrendaVestir.size()) {
				System.out.println("el codigo digitado NO existe para prendas de vestir");
			}
		}
		else if(tipoProducto.trim().equals("calzado")) {
			int contadorCalzado = 0;
			for (int i = 0; i < listaCalzado.size(); i++) {
				Calzado calzado = listaCalzado.get(i);
				if (calzado.getCodigo().equals(codigo)) {
					System.out.println("la cantidad minima en bodega actual es: "+ calzado.getCantidadMinimaBodega());
					System.out.println("digite cantidad minima en bodega a actualizar:");
					int cmbCalzado = entradaDos.nextInt();
					if(cmbCalzado > 0) {
						calzado.setCantidadMinimaBodega(cmbCalzado);
					}else {
						calzado.setCantidadMinimaBodega(0);
						System.out.println("el valor digitado incumple con la validacion o es igual a cero - cantidad minima requerida sera CERO");
					}
				}else {
					contadorCalzado +=1;
				}
			}
			
			if (contadorCalzado == listaCalzado.size()) {
				System.out.println("el codigo digitado NO existe para prendas de vestir");
			}
		}

	}
	
	/**
	 * method venderProducto
	 * solicite el c�digo de un producto a vender, el tipo (calzado o prenda), y las unidades correspondientes, calcule el valor de la factura con descuento y sin descuento. 
	 * Validar que existan las unidades necesarias para la venta y modificar las unidades existentes 
	 * despu�s de la venta utilizando el m�todo set de la variable correspondiente.
	 * @param codigo, tipoProducto
	 */
	@SuppressWarnings("resource")
	public static void venderProducto(String codigo, String tipoProducto){
		Scanner entradaTres = new Scanner(System.in);
		if (tipoProducto.trim().equals("prenda")) {
			int contadorPrenda = 0;
			for (int i = 0; i < listaPrendaVestir.size(); i++) {
				PrendaVestir prendaVestir = listaPrendaVestir.get(i);
				if (prendaVestir.getCodigo().equals(codigo)) {
					System.out.println("digite la cantidad de unidades que necesita para la venta:");
					int cuvPrenda = entradaTres.nextInt();
					
					float totalaPagarConDescuento = (prendaVestir.calcularTotalPagar(cuvPrenda) - (prendaVestir.calcularTotalPagar(cuvPrenda) * PrendaVestir.getPorcentajeDescuento()));
					float totalaPagarSinDescuento = (prendaVestir.calcularTotalPagar(cuvPrenda));
					System.out.println("****************************************************");
					System.out.println("* Factura\n*PRODUCTO PRENDA: ---> " + prendaVestir.getDescripcion() + "\n"+
									"* PRECIO COMPRA: ----> "+ prendaVestir.getPrecioCompra() + "\n"+
									"* PRECIO VENTA: ---->"+prendaVestir.getPrecioVenta() + "\n"+
									"* TOTAL A PAGAR CON DESCUENTO: ---->" + totalaPagarConDescuento + "\n"+
									"* TOTAL A PAGAR SIN DESCUENTO: ---->" + totalaPagarSinDescuento);
					System.out.println("****************************************************\n\n");
					System.out.print("Confirmar venta (si o no):" );
					String confirmarVenta = entradaTres.next().toLowerCase().strip();
					if(cuvPrenda <= prendaVestir.getCantidadBodega() && (confirmarVenta.trim().equals("si") || confirmarVenta.trim().equals("s"))) {
						int cantidadBodegaActualiza = prendaVestir.getCantidadBodega() - cuvPrenda;
						prendaVestir.setCantidadBodega(cantidadBodegaActualiza);
						
						System.out.print("******LA EJECUION DE LA VENTA FUE EXITOSA**********");
					}else {
						System.out.println("********NO SE PUDO EJECUTAR VENTA: Las unidades o cantidad que esta solictando NO estan disponibles, por favor verifique con el admin");
					}
				}else {
					contadorPrenda +=1;
				}
			}
			
			if (contadorPrenda == listaPrendaVestir.size()) {
				System.out.println("NO existen prendas con el codigo digitado");
			}
		}
		else if(tipoProducto.trim().equals("calzado")) {
			int contadorCalzado = 0;
			for (int i = 0; i < listaCalzado.size(); i++) {
				Calzado calzado = listaCalzado.get(i);
				if (calzado.getCodigo().equals(codigo)) {
					System.out.println("digite la cantidad de unidades que necesita para la venta:");
					int cuvCalzado = entradaTres.nextInt();
					
					float totalaPagarConDescuento = (calzado.calcularTotalPagar(cuvCalzado) - (calzado.calcularTotalPagar(cuvCalzado) * Calzado.getPorcentajeDescuento()));
					float totalaPagarSinDescuento = (calzado.calcularTotalPagar(cuvCalzado));
					System.out.println("****************************************************");
					System.out.println("* Factura\n*PRODUCTO CALZADO: ---> " + calzado.getDescripcion() + "\n"+
									"* PRECIO COMPRA: ----> "+ calzado.getPrecioCompra() + "\n"+
									"* PRECIO VENTA: ---->"+calzado.getPrecioVenta() + "\n"+
									"* TOTAL A PAGAR CON DESCUENTO: ---->" + totalaPagarConDescuento + "\n"+
									"* TOTAL A PAGAR SIN DESCUENTO: ---->" + totalaPagarSinDescuento);
					System.out.println("****************************************************\n\n");
					System.out.print("Confirmar venta (si o no):" );
					String confirmarVenta = entradaTres.next().toLowerCase().strip();
					if(cuvCalzado <= calzado.getCantidadBodega() && (confirmarVenta.trim().equals("si") || confirmarVenta.trim().equals("s"))) {
						int cantidadBodegaActualiza = calzado.getCantidadBodega() - cuvCalzado;
						calzado.setCantidadBodega(cantidadBodegaActualiza);
						
						System.out.print("******LA EJECUION DE LA VENTA FUE EXITOSA**********");
					}else {
						System.out.println("********NO SE PUDO EJECUTAR VENTA: Las unidades o cantidad que esta solictando NO estan disponibles, por favor verifique con el admin");
					}
				}else {
					contadorCalzado +=1;
				}
			}
			
			if (contadorCalzado == listaCalzado.size()) {
				System.out.println("NO existen calzados con el codigo digitado");
			}
		}
		
	}
}
