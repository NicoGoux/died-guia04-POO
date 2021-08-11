package problema03;
import java.time.LocalDate;

public class Tramite implements Comisionables {
	
	private String descripcion;
	private String domicilio;
	private double precio;
	private LocalDate fechaEntregado;
	private boolean enProcesoEnvio;
	
	public Tramite (String descripcion, String domicilio) {
		this.descripcion=descripcion;
		this.domicilio=domicilio;
		this.precio=50;
		this.fechaEntregado=null;
		this.enProcesoEnvio=false;
	}
	
	public double comision() {
		return 20.0;
	}
	
	public void setProcesoEnvio() {
		this.enProcesoEnvio = true;
	}
	
	public void setFechaRealizado() {
		if (enProcesoEnvio==true) {
			this.fechaEntregado=LocalDate.now();
		}
	}
	
	public boolean entregado() {
		if (this.fechaEntregado!=null) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public LocalDate getFechaEntregado() {
		return this.fechaEntregado;
	}
}
