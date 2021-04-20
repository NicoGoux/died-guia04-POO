package problema02;

public class Producto {
	private String descripcion;
	private double precio;
	
	public Producto (String desc, double precio) {
		this.descripcion = desc;
		this.precio=precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
