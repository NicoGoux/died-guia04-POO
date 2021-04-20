package problema02;
import java.util.ArrayList;

public class PedidoBasico extends Pedido {
	private boolean express;
	
	public PedidoBasico() {
		this.cantProductos=0;
		this.listaProd = new ArrayList<>(1);
		this.precio=0;
		this.express=false;
		this.fechaEntrega=null;
		this.enProcesoEnvio=false;
	}
	
	public void pedidoExpress() {
		this.express=true;
	}
	
	public boolean agregarProducto(Producto p){
		if (this.cantProductos<5) {
			super.agregarProducto(p);
			this.cantProductos++;
			return true;
		}
		
		else {
			return false;
		}
	}

	public void precio() {
		double precioTotalProd=0;
		for (Producto unProducto : this.listaProd) {
			precioTotalProd+=unProducto.getPrecio();
		}
		
		this.precio=precioTotalProd+this.comision();
	}

	public double comision() {
		
		double precioTotalProd=0;
		for (Producto unProducto : this.listaProd) {
			precioTotalProd+=unProducto.getPrecio();
		}
		
		double comision = precioTotalProd * 0.05;
		
		if (this.express==true) {
			comision = (comision + precioTotalProd)*0.20;
			return comision;
		}
		
		else {
			return comision;
		}
	}
}
