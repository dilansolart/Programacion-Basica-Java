package ComponentePractico;

public class Producto {
	
	private String codigo;
	private String descripcion;
	private float precioCompra;
	private float precioVenta;
	private int cantidadBodega;
	private int cantidadMinimaBodega;
	private int cantidadMaximaInventario;
	private static float porcentajeDescuento = 0.01f;
	
	
	
	
	
	public Producto() {
	
	}


	public Producto(String codigo, String descripcion, float precioCompra, float precioVenta, int cantidadBodega,
			int cantidadMinimaBodega, int cantidadMaximaInventario) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.cantidadBodega = cantidadBodega;
		this.cantidadMinimaBodega = cantidadMinimaBodega;
		this.cantidadMaximaInventario = cantidadMaximaInventario;
	}
	
	



	public String getCodigo() {
		return codigo;
	}





	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}





	public String getDescripcion() {
		return descripcion;
	}





	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}





	public float getPrecioCompra() {
		return precioCompra;
	}





	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}





	public float getPrecioVenta() {
		return precioVenta;
	}





	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}





	public int getCantidadBodega() {
		return cantidadBodega;
	}





	public void setCantidadBodega(int cantidadBodega) {
		this.cantidadBodega = cantidadBodega;
	}





	public int getCantidadMinimaBodega() {
		return cantidadMinimaBodega;
	}





	public void setCantidadMinimaBodega(int cantidadMinimaBodega) {
		this.cantidadMinimaBodega = cantidadMinimaBodega;
	}





	public int getCantidadMaximaInventario() {
		return cantidadMaximaInventario;
	}





	public void setCantidadMaximaInventario(int cantidadMaximaInventario) {
		this.cantidadMaximaInventario = cantidadMaximaInventario;
	}





	public static float getPorcentajeDescuento() {
		return porcentajeDescuento;
	}





	public static void setPorcentajeDescuento(float porcentajeDescuento) {
		Producto.porcentajeDescuento = porcentajeDescuento;
	}




	public boolean solicitarPedido(){
		return cantidadBodega < cantidadMinimaBodega;
	}
	
	public float calcularTotalPagar(int cantidadUnidadesCompra) {
		return cantidadUnidadesCompra * precioVenta;
	}

}
