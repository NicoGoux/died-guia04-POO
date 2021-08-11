package problema02;
import java.time.format.DateTimeFormatter;

public class app {
	public static void main(String[] args) {
		Producto prod1 = new Producto ("Teclado", 100);
		
		Pedido pedido1 = new PedidoBasico();
		
		pedido1.agregarProducto(prod1);
		((PedidoBasico)pedido1).pedidoExpress();
		System.out.println("El Pedido 1 se marco como express\n");
		pedido1.precio();
		
		Pedido pedido2 = new PedidoPremium();
		
		for(int i=0;i<21;i++) {
			if(!pedido2.agregarProducto(prod1)) {
				System.out.println("No se ha podido agregar el producto al pedido 2. Limite de 20 productos alcanzado.\n");
			}
		}
		
		pedido2.precio();
		
		pedido1.comision();
		pedido2.comision();
		
		Cadete c1 = new Cadete();
		c1.agregarPedido(pedido1);
		c1.agregarPedido(pedido2);
		
		System.out.println("El Cadete 1 cobr� por comisiones $"+c1.comision()+"\n");
		
		pedido1.envio();
		pedido1.comision();
		System.out.println("Pedido 1 entregado. Fecha de entrega: "+pedido1.getFechaEntrega().format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Precio $"+pedido1.getPrecio()+"\n");
		
		pedido2.envio();
		pedido2.comision();
		System.out.println("Pedido 2 entregado. Fecha de entrega: "+pedido2.getFechaEntrega().format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println("Precio $"+pedido2.getPrecio()+"\n");
		
		
		System.out.println("El Cadete 1 cobr� por comisiones $"+c1.comision());
	}
}
