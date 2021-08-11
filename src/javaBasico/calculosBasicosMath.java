package javaBasico;

import java.util.ArrayList;
import java.util.Collections;

//import java.lang.Math;

public class calculosBasicosMath {
	
	private int hola;
	
	
	
	
	public calculosBasicosMath(int hola) {
		super();
		this.hola = hola;
	}

	/*public static void main (String[] args) {
		ej1 (0,0);
		System.out.println("\n");
		
		ej2(5,5);
		System.out.println("\n");
		
		ej3(2);
	}*/
	
	private static void ej1 (double a, double b) {
		System.out.println("Suma: " + (a+b));
		System.out.println("Resta: "+(a-b));
		System.out.println("Multiplicacion: "+ (a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modulo: "+(a%b));
	}
	
	private static void ej2 (double a, double b) {
		
		if (a<b) {
			System.out.println ("Mayor numero: "+b);
		}
		else if (a>b) {
			System.out.println("Mayor numero: "+a);
		}
		else {
			System.out.println("Ambos numeros son iguales");
		}
	}
	
	private static void ej3(double a) {
		System.out.println("El cuadrado de "+a+" es: "+Math.pow(a,2));
	}
	
	public int pisoArreglo(int[] arreglo,int x) {
		int mitad = arreglo.length /2;
		if(x > arreglo[arreglo.length-1]) {
			return arreglo[arreglo.length-1];
		}
		
		if (mitad < 1) {
			return -1;
		}
		
		else {
			if (arreglo[mitad]<x && arreglo[mitad+1] >= x) {
				return arreglo[mitad];
			}
			
			else {
				int tamanio=0;
				int inicio =0;
				if (arreglo[mitad]>x) {
					tamanio= mitad;
					inicio =0;
				}
				else if (arreglo[mitad+1]<x) {
					tamanio = arreglo.length - mitad;
					inicio=mitad;
					
				}
				
				int[] nuevoarreglo= new int[tamanio];
				System.arraycopy(arreglo, inicio, nuevoarreglo, 0, tamanio);
				return pisoArreglo(nuevoarreglo, x);
			}
		}
	}
	
	public int mediana(int[] arreglo) {
		ArrayList<Integer> mayores= new ArrayList<Integer>(1);
		ArrayList<Integer> menores= new ArrayList<Integer>(1);
		int iguales=0;	
		for (int i=0;i<arreglo.length;i++) {
			if(i!=arreglo.length/2) {
				if(arreglo[i]<arreglo[arreglo.length/2]) {
					menores.add(arreglo[i]);
				}
				else if (arreglo[i]>arreglo[arreglo.length/2]){
					mayores.add(arreglo[i]);
				}
				else {
					iguales++;
				}
			}
		}		
		if (menores.size()==mayores.size() || (mayores.size()-menores.size()==1 && arreglo.length%2!=0)) {
			return arreglo[arreglo.length/2];
		}
		
		else if(menores.size()<mayores.size()) {
			Collections.sort(mayores);
			int diferencia=mayores.size()-menores.size();
			if (diferencia==iguales) {
				return arreglo[arreglo.length/2];
			}
			else {
				return medianaArrayList(arreglo, mayores.get(0).intValue());
			}
		}
		
		else {
			Collections.sort(menores);
			int diferencia=menores.size()-mayores.size();
			if (diferencia==iguales) {
				return arreglo[arreglo.length/2];
			}
			else {
				return medianaArrayList(arreglo, menores.get(menores.size()-1).intValue());
			}
		}
	}
	
	public int medianaArrayList(int[] arreglo, int valorMedio) {
		ArrayList<Integer> mayores= new ArrayList<Integer>(1);
		ArrayList<Integer> menores= new ArrayList<Integer>(1);
		int iguales=-1;
		
		for (int i=0;i<arreglo.length;i++) {
			if(i!=arreglo.length/2) {
				if(arreglo[i]<valorMedio) {
					menores.add(arreglo[i]);
				}
				else if (arreglo[i]>valorMedio){
					mayores.add(arreglo[i]);
				}
				else {
					iguales++;
				}
			}
		}
		
		if (menores.size()==mayores.size() || (mayores.size()-menores.size()==1 && arreglo.length%2!=0)) {
			return valorMedio;
		}
		
		else if(menores.size()<mayores.size()) {
			Collections.sort(mayores);
			int diferencia=mayores.size()-menores.size();
			if (diferencia==iguales) {
				return valorMedio;
			}
			else {
				return medianaArrayList(arreglo, mayores.get(0).intValue());				
			}
		}
		
		else {
			Collections.sort(menores);
			int diferencia=menores.size()-mayores.size();
			if (diferencia==iguales) {
				return arreglo[arreglo.length/2];
			}
			else {
				return medianaArrayList(arreglo, menores.get(menores.size()-1).intValue());
			}
		}
	}
}
