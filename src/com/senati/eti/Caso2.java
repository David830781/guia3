package com.senati.eti;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Ingrese numero: ");
	     int n = sc.nextInt();
	     
	     int sumatoria = 0; //Acumulador
	     int i = 1;
	     String signo="+";
	     while (i<= n) {
	    	 sumatoria += i;
	    	 System.out.print(i + signo);
	    	i++;
	    	if(i==n) {
	    		signo ="=";
	    	}
	    
	     }
	 	 System.out.println(sumatoria);
		 //System.out.println("\nLa sumatoria es : "+ sumatoria);
    	 
	}

}
