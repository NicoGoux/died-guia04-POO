package problema02;
import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Pedido {
	protected int cantProductos;
	protected ArrayList<Producto> listaProd;
	protected double precio;
	protected LocalDate fechaEntrega;
	protected boolean enProcesoEnvio;
	
	protected boolean agregarProducto(Producto p) {
		listaProd.add(p);
		return true;
	}
	
	public double getPrecio () {
		return this.precio;
	}
	
	public int getCantProd() {
		return this.cantProductos;
	}
	
	public abstract void precio();
	
	public abstract double comision();
	
	public LocalDate getFechaEntrega() {
		return this.fechaEntrega;
	}
	
	public void setProcesoEnvio() {
		this.enProcesoEnvio=true;
	}
	
	public void envio() {
		if(this.enProcesoEnvio=true) {
			this.fechaEntrega=LocalDate.now();
		}
	}
}
