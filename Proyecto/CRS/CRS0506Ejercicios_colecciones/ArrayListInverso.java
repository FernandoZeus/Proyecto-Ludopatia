package CRS0506Ejercicios_colecciones;

import java.util.ArrayList;
import java.util.Collections;

import CRS0506Ejercicios_colecciones.cosas.Persona;

public class ArrayListInverso {

	public static void main(String[] args) {
		NombresI(Entero_a_Array.Nombres(10));

		
	}
	
	   public static ArrayList <Persona> NombresI(ArrayList <Persona> inverso) {
		    
		 
		    Collections.reverse(inverso);
		    System.out.println();
		    for (int i = 0; i < inverso.size(); i++) {
		        
		    	System.out.println(inverso.get(i));
				
			}
		   
		   return inverso ;
	   }		
	
	

}


