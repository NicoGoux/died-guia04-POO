package problema01;

import java.util.ArrayList;

public class Camino {
	
	private ArrayList<Coordenada> listaCoord;
	
	public void agregar(Coordenada X) {
		this.listaCoord.add(X);
	}
	
	public void agregar(double lat, double lng) {
		this.listaCoord.add(new Coordenada(lng, lat));
	}
	
	public void agregar(int mtsLt, int mtsLn) {
		double earth = 6387.137;
		var pi = Math.PI;
		var m = (1/((2*pi/360)*earth))/1000;
		
		double lat = mtsLt * m;
		double longitud = (mtsLn * m)/(Math.cos(lat * (pi/180)));
		
		this.listaCoord.add(new Coordenada(longitud,lat));
	}
}
