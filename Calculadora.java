package calculadora;
import java.util.*;
/*
 * Programa que solicita dos números por teclado y realiza  
 * operaciones básicas con ellos
 */

public class Calculadora {

	public static void main(String[] args) {

		int resultado=0; //almacena el resultado de la operación
			 
				System.out.println("Introduce un número: ");
				//crea una instancia para leer de teclado y se almacena primer número
				Scanner teclado = new Scanner (System.in);
				int	numero1 = teclado.nextInt();
				System.out.println("Introduce otro número: ");
				int	numero2 = teclado.nextInt();
				System.out.println("Elija la operación: ");
				System.out.println("1. Suma ");
				System.out.println("2. Resta ");
				byte opc = teclado.nextByte();
				teclado.close();
				switch(opc) {
				case 1:
					resultado=numero1+numero2;
					System.out.print("La suma es: "+resultado);
					break;
				case 2:
	
					resultado=numero1-numero2;
					System.out.print("La resta es: "+ resultado);
					break;
				}
	}

}
