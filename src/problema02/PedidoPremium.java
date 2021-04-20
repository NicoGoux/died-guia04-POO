package problema02;

import java.util.ArrayList;

public class PedidoPremium extends Pedido{
	
	public PedidoPremium() {
		this.cantProductos=0;
		this.listaProd = new ArrayList<>(1);
		this.precio=0;
		this.fechaEntrega=null;
		this.enProcesoEnvio=false;
	}
	
	protected boolean agregarProducto(Producto p){
		if (this.cantProductos<20) {
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
		
		if (this.listaProd.size()<5) {
			precioTotalProd += precioTotalProd * 0.20;
		}
		
		else {
			precioTotalProd += precioTotalProd * 0.30;
		}
		
		this.precio = precioTotalProd;
	}

	public double comision() {
		double comision=0;
		comision += this.precio*0.15;
		if (this.cantProductos>10) {
			comision+=50;
		}
		return comision;
	}
}
