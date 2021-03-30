package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		 String estado ="",continuar="S";
		int num_alu= 0;
		double npr1=0;
		double npr2=0;
		double npr3=0;
		
		while(continuar.equals("S") || continuar.equals("s")) {
			num_alu++;
			
		System.out.println("********************************");
		System.out.println("Registro " + num_alu + " ");
		System.out.println("********************************");
			
			
		System.out.println("Nombre del alumno: ");
		String nom = sc.nextLine();
		
		System.out.println("Nota 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Nota 2: ");
		int n2 = sc.nextInt();
		
		System.out.println("Nota 3: ");
		int n3 = sc.nextInt();
		
		System.out.println("Asistencia [1-12]: ");
		int as = sc.nextInt();
		
		
	    npr1 =n1*0.20;
	    npr2 =n2*0.30;
	    npr3 =n3*0.50;
	   
		
	    double prom = npr1+npr2+npr3;
		int tlt = 12;
		float ap = as*100/tlt;
		
		if(prom >=13) {
			   estado ="Obtiene certificado";
			  }
			else
				estado ="Sin certificado";
			sc.nextLine();
			System.out.println("\nResultados ");
			System.out.println("------------ ");
			System.out.println("Promedio: " +  df.format(prom));
			System.out.println("Asistencia: " +  df.format(ap) +"%");
			System.out.println("Estado: " + estado);
			
			System.out.println("------------------------- ");
			System.out.println("¿Registrar otro <S/N>?: ");
			System.out.println("------------------------- ");
			continuar = sc.nextLine();
		
			System.out.println("\n.... R E S U M E N ....");
			System.out.println("------------------------- ");
			System.out.println("Numero de alumnos: " + num_alu);
			System.out.println("Mayor promedio: " + num_alu + "pertenece a " + "");
			System.out.println("Menor promedio: " + num_alu);
			//System.out.println("Numero de alumnos certificados: " + );
			//System.out.println("Numero de alumnos sin certificados: " + );
		}
	}

}
