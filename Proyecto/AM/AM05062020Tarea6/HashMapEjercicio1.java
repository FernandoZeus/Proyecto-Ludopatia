package AM05062020Tarea6;

import java.util.ArrayList;
import java.util.HashMap;

import Recurso.Persona;

public class HashMapEjercicio1 {

	public static void main(String[] args) {
		
		//Esto es para el ejemplo
		System.out.println(listaHashMap(6));
	}
	
	public static HashMap<String, ArrayList<Persona>> listaHashMap(int tamanio){
		
		//Por cada letra de la cadena tengo que tener una lista con la gente que tenga esa inicial en su nombre
        HashMap<String, ArrayList<Persona>> personasPorLetra =  new HashMap<String, ArrayList<Persona>>();
        
        //Este for hace que por cada letra del abecedario me meta un ArrayList, como si fuera una agenda por letras
        for(char l = 'A'; l <='Z'; l++) {
        	personasPorLetra.put(l + "", new ArrayList<Persona>());
        }
        
       //Con este for lo que hago es hacer el n�mero de personas que tengo que crear y ordenar por letra 
       for (int i = 0; i < tamanio; i++) {
			Persona persona = Persona.generarPersona();
			
			String letra = persona.obtenerNombre().charAt(0) + "";
			ArrayList<Persona> personasEnLetra = personasPorLetra.get(letra);
            personasEnLetra.add(persona);
		}
        return personasPorLetra;
	}

}
