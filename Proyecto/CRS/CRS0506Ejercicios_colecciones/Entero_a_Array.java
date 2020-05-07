package CRS0506Ejercicios_colecciones;

import java.util.ArrayList;

import CRS0506Ejercicios_colecciones.cosas.Persona;

public class Entero_a_Array {

	public static void main(String[] args) {
		Nombres(10);

		
	}
	
	   public static ArrayList <Persona> Nombres(int i) {
		    ArrayList<Persona> listadePersonas = new ArrayList<Persona>();
		    
		   for(int y=0; y<=i;y++) {
			   listadePersonas.add(y,Persona.generarPersona());
			   System.out.println(listadePersonas.get(y));
		   }
		   
		   return  listadePersonas;
	   }		
	
	

}
