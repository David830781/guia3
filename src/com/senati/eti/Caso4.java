package com.senati.eti;
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =0, i = 1, num_mayor = 0;
		
		while (i <= 4) {
			
			System.out.println("Ingrese numero " + i + ": ");
			n = sc.nextInt();
			
			if (n > num_mayor) num_mayor = n;
			
			i++;
			}
		    
		  System.out.println("========= Resultados ============"); 
	      System.out.println("El numero mayor es: " + num_mayor);
}
}