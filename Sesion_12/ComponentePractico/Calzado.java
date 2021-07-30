package ComponentePractico;

public class Calzado extends Producto implements Vista{

	private int talla;

	public Calzado() {

	}

	public Calzado(String codigo, String descripcion, float precioCompra, float precioVenta, int cantidadBodega,
			int cantidadMinimaBodega, int cantidadMaximaInventario, int talla) {
		super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinimaBodega,
				cantidadMaximaInventario);
		this.talla = talla;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	// ●	Método 2: mostrar sólo el código y la descripción del producto 
	// separados por guión medio (-).
	@Override
	public String metodo2() {
		// TODO Auto-generated method stub
		return String.format("%s-%s", getCodigo(), getDescripcion());
	}

	// ●	Método 3: mostrar sólo el código, la descripción, el precio de compra
	//  y el precio de venta del producto separados por guión medio (-).
	@Override
	public String metodo3() {
		// TODO Auto-generated method stub
		return String.format("%s-%s-%.2f-%.2f", getCodigo(), getDescripcion(), getPrecioCompra(), getPrecioVenta());
	}

	
	
	
	
	

	
	
	
}
