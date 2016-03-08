package prueba;
 // variable miembro de la clase 
public class Main {
	static int n1=50;
	/**
	 * comentario de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		int entero = 10 + 20;

		System.out.println("El valor del entero es:" + entero);// + se llama concaconador y sirve para unir el texto azul con la variable "entero".
		/*
		 * comentario parrafo
		 */
		System.out.println("El valor del entero es:" + entero+1);// se puede unir mas que solo variables
		System.out.println("El valor del entero es:" + (entero+1));// de esta manera el contenador es una suma
		System.out.println(entero+1); // al no tener texto es una suma
		/*
		 * Si no hay comillas el mas es aritmetrico
		 */
		int suma1 = entero + 1;
		System.out.println("EL resultado es:" + suma1);// se puede llamar a mas de un variable en un amisma operacion 
		System.out.println("EL resultado es:" + (suma1 + entero)); //se puede usar una bariable q a sido usada para generar otra bariable
		int n2=30, suma=0; // variables locales
		suma=n1+n2;
		System.out.println("LA SUMA ES:"  + suma); 
	}

}
