package problema02;
import java.util.ArrayList;

public class Cadete {
	
	private ArrayList<Pedido> listaPedidos;
	
	public Cadete() {
		this.listaPedidos = new ArrayList<>(1);
	}
	
	public void agregarPedido(Pedido p) {
		this.listaPedidos.add(p);
		p.setProcesoEnvio();
	}
	
	public double comision() {
		double comision = 0;
		for (Pedido unPedido : this.listaPedidos) {
			if (unPedido.getFechaEntrega()!=null) {
				if (unPedido instanceof PedidoBasico) {
					comision += unPedido.getPrecio()*0.1;
				}
				else if (unPedido instanceof PedidoPremium) {
					comision += unPedido.getPrecio()*0.15;
					if (unPedido.getCantProd()>10) {
						comision+=50;
					}
				}
			}
		}
		return comision;
	}
}
