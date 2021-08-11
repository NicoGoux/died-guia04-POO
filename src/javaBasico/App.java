package javaBasico;

public class App {
	public static void main(String[] args) {
		calculosBasicosMath mat= new calculosBasicosMath(0);
		int[] a= {2,2,3,5,6,8,12,45,67,89,112};
		int x=150;
		int piso = mat.pisoArreglo(a, x);
		System.out.println("El piso es: "+piso);
		
		//int[] b= {1,1,1, 2, 3, 5, 6, 6, 7, 8, 9};
		int[] b={8,96,33,92,97,13,84,79};//{2, 1, 1, 1, 3, 6, 5, 6, 7, 9, 8};  { 550, 51,30, 89, 33, 10, 10, 1, 2, 3,50, 51, 9 }
		
		int mediana = mat.mediana(b);
		System.out.println("La mediana es: "+mediana);
	}
}
