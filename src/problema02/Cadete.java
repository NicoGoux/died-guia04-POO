package problema02;
import java.util.ArrayList;
import problema03.*;

public class Cadete {
	
	private ArrayList<Comisionables> listaPedidos;
	
	public Cadete() {
		this.listaPedidos = new ArrayList<>(1);
	}
	
	public void agregarPedido(Comisionables p) {
		this.listaPedidos.add(p);
		p.setProcesoEnvio();
	}
	
	public double comision() {
		double comision = 0;
		for (Comisionables unPedido : this.listaPedidos) {
			if (unPedido.entregado()) {
				comision += unPedido.comision();
			}
		}
		return comision;
	}
}
