package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Factorial
		// n=5
		// 1 x 2 x 3 x 4 x 5 = 120
		Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Ingrese numero: ");
	     int n = sc.nextInt();
	     
	     int  factorial= 0; 
	     int i = 1;
		 
	     String signo=" x ";
	     while (i<= n) {
	    	 factorial *= i;
	    	 System.out.print(i + signo);
	    	i++;
	    	
	    	if(i==n) {
	    		signo =" = ";
	    		 
		
	}

	     }
	     System.out.println(factorial);
	}
}
