package ComponentePractico;

public class PrendaVestir extends Producto {
	
	
	private String talla;
	private char permitePlanchado;
	
	
	
	
	public PrendaVestir() {}

	public PrendaVestir(String codigo, String descripcion, float precioCompra, float precioVenta, int cantidadBodega,
			int cantidadMinimaBodega, int cantidadMaximaInventario, String talla, char permitePlanchado) {
		super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinimaBodega,
				cantidadMaximaInventario);
		this.talla = talla;
		this.permitePlanchado = permitePlanchado;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public char isPermitePlanchado() {
		return permitePlanchado;
	}

	public void setPermitePlanchado(char permitePlanchado) {
		this.permitePlanchado = permitePlanchado;
	}
	
	
	

}
