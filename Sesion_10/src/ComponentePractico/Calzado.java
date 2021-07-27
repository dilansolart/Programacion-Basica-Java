package ComponentePractico;

public class Calzado extends Producto{

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

	
	
	
	
	

	
	
	
}
