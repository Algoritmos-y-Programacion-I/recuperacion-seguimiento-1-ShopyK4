/** 
package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   
        
        

        // Declaracion de info a pedir del usuario 

		
		int numero1, numero2, numero3;


        // Pedir info al usuario 



		

		System.out.println("Digite el primer numero: ");
		numero1 = escaner.nextInt();
		System.out.println("Digite el segundo numero: ");
		numero2 = escaner.nextInt();
		System.out.println("Digite el tercer numero: ");
		numero3 = escaner.nextInt();
		


        // Declaracion de salidas calculadas 

		int resultado = contarIguales(numero1, numero2, numero3);


       


        // Calculo de salidas mediante metodos 
        
		


        // Mostramos las salidas al usuario

		System.out.println("El resultado es: " + resultado);
        
	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}

    /**
	 * Descripción: El método permite verificar si los tres numeros ingresados son iguales con operadores logicos
	 * @param int num1, int num2, int num3
	 * @return 
	 

	public int contarIguales(int num1, int num2, int num3){
			
		    if (num1 == num2 && num2 == num3) {
        	return 3; 
    	}
	 		if (num1 == num2 || num1 == num3 || num2 == num3) {
        	return 2; 
    	} 
			else {
        	return 0; 
   		}

	}

	
	}
	
	*/



// Ejercicio 2

/** 

package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   
        
        

        // Declaracion de info a pedir del usuario 

		
		String nombre;
		int numero;


        // Pedir info al usuario 



		

		System.out.println("Por favor escriba su nombre: ");
		nombre = escaner.nextLine();
		System.out.println("Digite 1 para saludo o 0 para despedida: ");
		numero = escaner.nextInt();


        // Declaracion de salidas calculadas 


		
		String mensaje = SaludarD(nombre, numero);

       


        // Calculo de salidas mediante metodos 
        
		


        // Mostramos las salidas al usuario

		System.out.println(mensaje);
        
	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}

    /**
	 * Descripción: El método permite verificar si los tres numeros ingresados son iguales con operadores logicos
	 * @param int num1, int num2, int num3
	 * @return 
	 
	
	public static String SaludarD(String nombre, int numero){

		if (numero == 1){
			return "Hola " + nombre;
		}
		if (numero == 0){
			return "Chao " + nombre;
		}
		else {
			return "Ingrese un numero valido";
		}
	




		}
	
	}
	

	*/


// Ejercicio 3
/**
	package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   
        
        

        // Declaracion de info a pedir del usuario 


		String palabra1, palabra2, palabra3;


        // Pedir info al usuario 



		

		System.out.println("Por favor escriba la primer palabra que desea ingresar: ");
		palabra1 = escaner.nextLine();
		System.out.println("Por favor escriba la segunda palabra que desea ingresar: ");
		palabra2 = escaner.nextLine();
		System.out.println("Por favor escriba la tercer palabra que desea ingresar: ");
		palabra3 = escaner.nextLine();


        // Declaracion de salidas calculadas 


		int resultado = verificarLongitud(palabra1, palabra2, palabra3);

        // Calculo de salidas mediante metodos 
        
		


        // Mostramos las salidas al usuario


		System.out.println("El resultado es: " + resultado);
	
	
	
	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}






	 * Descripción: El método permite verificar si los tres numeros ingresados son iguales con operadores logicos
	 * @param int num1, int num2, int num3
	 * @return 

	
	public static int verificarLongitud(String palabra1, String palabra2, String palabra3){
		int contador = 0;

		if (palabra1.length() >= 4) {
            contador += 1;
        }
        if (palabra2.length() >= 4) {
            contador += 1;
        }
        if (palabra3.length() >= 4) {
            contador += 1;
        }
		return contador;


	}


}

*/



// Ejercicio 4


/** 

	package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   
        
        

        // Declaracion de info a pedir del usuario 


		String palabra1, palabra2;


        // Pedir info al usuario 



		

		System.out.println("Por favor escriba la primer palabra que desea ingresar: ");
		palabra1 = escaner.nextLine();
		System.out.println("Por favor escriba la segunda palabra que desea ingresar: ");
		palabra2 = escaner.nextLine();


        // Declaracion de salidas calculadas 
		boolean mensaje = comprobarPosicion(palabra1, palabra2);


        // Calculo de salidas mediante metodos 
        
		


        // Mostramos las salidas al usuario

		System.out.println(mensaje);

	

	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}





    
	 * Descripción: El método permite verificar si los tres numeros ingresados son iguales con operadores logicos
	 * @param int num1, int num2, int num3
	 * @return 
	 
	
public static boolean comprobarPosicion(String palabra1, String palabra2) { 
        if (palabra1.length() < 3 || palabra2.length() < 3){
            System.out.println("Error: Alguna de las dos palabras es es muy corta");
            	return false;
        }
        return palabra1.charAt(2) == palabra2.charAt(2);
    }
}
 */

// Ejercicio 5

	package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	private Scanner escaner;

    // Declaracion de constantes 

	private RecuperacionSeguimiento1() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run() // Aqui en el metodo run hacemos lo de nuestro metodo main. Solo entrada de datos, mensajes al usuario y mostrar salidas
	{   
        
        

        // Declaracion de info a pedir del usuario 


		Double numero1, numero2, numero3;


        // Pedir info al usuario 



		

		System.out.println("Por favor digite el primer numero: ");
		numero1 = escaner.nextDouble();
		System.out.println("Por favor digite el segundo numero: ");
		numero2 = escaner.nextDouble();
		System.out.println("Por favor digite el tercer numero: ");
		numero3 = escaner.nextDouble();



		ecuacionCuadratica(numero1, numero2, numero3);



        // Declaracion de salidas calculadas 
	


        // Calculo de salidas mediante metodos 
        
		


        // Mostramos las salidas al usuario

	

	

	}

	public static void main(String[] args) {
		RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
		mainApp.run();
	}





    /**
	 * Descripción: El método permite verificar si los tres numeros ingresados son iguales con operadores logicos
	 * @param int num1, int num2, int num3
	 * @return 
	 */

	public static void ecuacionCuadratica(double numero1, double numero2, double numero3){
		double discriminante = Math.pow(numero2 , 2) - 4 * numero1 * numero3;
			if (discriminante < 0) {
			System.out.println("No hay soluciones reales");
			}
			else {
				double x1 = (-numero2 +  Math.sqrt(discriminante) / (2 * numero1));
				double x2 = (-numero2 -  Math.sqrt(discriminante) / (2 * numero1));
				System.out.println("Las soluciones reales son: x1 = " + x1 + ", x2 = " + x2);
			}
			
	}



}
 