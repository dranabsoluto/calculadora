package calculadora;
import java.util.*;
/*
 * Programa que solicita dos n�meros por teclado y realiza  
 * operaciones b�sicas con ellos
 */

public class Calculadora {

	public static void main(String[] args) {

		int resultado=0; //almacena el resultado de la operaci�n
			 
				System.out.println("Introduce un n�mero: ");
				//crea una instancia para leer de teclado y se almacena primer n�mero
				Scanner teclado = new Scanner (System.in);
				int	numero1 = teclado.nextInt();
				System.out.println("Introduce otro n�mero: ");
				int	numero2 = teclado.nextInt();
				System.out.println("Elija la operaci�n: ");
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
