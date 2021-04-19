package problema01;

public class Coordenada {
	private double longitud;
	private double latitud;
	
	public Coordenada() {
		this.longitud=0.0;
		this.latitud=0.0;
	}
	
	public Coordenada(double longitud,double latitud) {
		this.longitud=longitud;
		this.latitud=latitud;
	}

	public boolean equals(Coordenada otraCoordenada) {
		if (this == otraCoordenada) {
			return true;
		}
		
		else if (this.longitud == otraCoordenada.getLong() && this.latitud == otraCoordenada.getLat()){
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public String toString() {
		String cadena = this+"";
		return cadena;
	}
	
	public double getLong() {
		return this.longitud;
	}
	
	public double getLat() {
		return this.latitud;
	}
}


