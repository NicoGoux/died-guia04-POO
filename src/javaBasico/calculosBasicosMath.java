package javaBasico;

//import java.lang.Math;

public class calculosBasicosMath {
	
	public static void main (String[] args) {
		ej1 (0,0);
		System.out.println("\n");
		
		ej2(5,5);
		System.out.println("\n");
		
		ej3(2);
	}
	
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

}
