package CRS0506Ejercicios_colecciones;

import java.util.LinkedList;

import CRS0506Ejercicios_colecciones.cosas.Persona;

public class Linked_Push_PoP {
	public static void main(String[] args) {
		
		System.out.println("Lista con push");
		 System.out.println();
		NombresL(4);
		
		System.out.println();
		
		System.out.println("Lista la reves con push and pop");
		 System.out.println();
	
		LinkedList<Persona>listaAMeter = new LinkedList<Persona>();
        for (int i = 0; i < 4; i++) {
            Persona p = Persona.generarPersona();
            listaAMeter.add(p);
        }
        
        System.out.println(listaAMeter);
        
       
        
        System.out.println(NombresI(listaAMeter));
    }

		
	
	
	   public static LinkedList <Persona> NombresL(int i) {
		    
		   
		   LinkedList <Persona> Listapersonas = new LinkedList <Persona>();
		   
		   
		   for (int y = 0; y < i; y++) {
			   
			   Listapersonas.push(Persona.generarPersona());
			    
		        System.out.println(Listapersonas);
				
			}
			
		   
		   return Listapersonas  ;
	   }	
	   public static LinkedList <Persona> NombresI(LinkedList <Persona> inverso) {
		    
		   
		   LinkedList <Persona> Listapersonasi = new LinkedList <Persona>();
		   
		   int Size= inverso.size();
		   
		   for (int y = 0; y < Size; y++) {
			   Persona p = inverso.pop(); 
			  Listapersonasi.push(p); 
			   
			 
				
			}
			
		   
		   return Listapersonasi ;
	   }	

	
}
