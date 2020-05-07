package CRS0506Ejercicios_colecciones;
import java.util.ArrayList;
import java.util.HashMap;

import CRS0506Ejercicios_colecciones.cosas.Persona;

public class Hashmap {

	
	public static void main(String[] args) {
	System.out.println(Censo(6));
}

    public static HashMap<String, ArrayList<Persona>> Censo (int p){

    //Por cada letrapersona de la cadena tengo que tener una lista con la gente que tenga esa inicial en su nombre
    HashMap<String, ArrayList<Persona>> CensoPErsonas =  new HashMap<String, ArrayList<Persona>>();

    for(char l = 'A'; l <='Z'; l++) {
        CensoPErsonas.put(l + "", new ArrayList<Persona>());
    }

   for (int i = 0; i < p; i++) {
	   
        Persona persona = Persona.generarPersona();
        String letrapersona = persona.obtenerNombre().charAt(0)+"";
        ArrayList<Persona> Personaporletrapersona = CensoPErsonas.get(letrapersona);
        Personaporletrapersona.add(persona);
       
    }
   System.out.println();
    return CensoPErsonas;
}
}
