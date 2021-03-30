package com.senati.eti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Definimos n como 0 y i el numero de incidencias que en este caso es 5
		int n = 0,i = 1;
		double menor = Double.POSITIVE_INFINITY;//Defino menor como un numero infinito
		//Para que el valor ingresado no exceda a la variable menor 
		
		while (i <= 5) {
			System.out.println("Ingrese numero " + i + " : ");
			n = sc.nextInt();
		 
			if (n < menor)
				menor = n;
			    i++;
		}
        System.out.println("El numero menor es: " + menor);//Mostramos al usuario el menor dato
	}

}
