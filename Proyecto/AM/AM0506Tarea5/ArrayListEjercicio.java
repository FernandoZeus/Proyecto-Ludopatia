package AM0506Tarea5;
import java.util.ArrayList;
import java.util.Collections;

import Recurso.Persona;

public class ArrayListEjercicio {

	public static void main(String[] args) {
		
		
		arrayListPersona(10);
		
		System.out.println();
		
		//Creo un ArrayList para poder usarlo con la segunda funci�n
		ArrayList<Persona> listaPersona = new ArrayList<Persona>();
		
		for (int i = 0; i < 5; i++) {
			listaPersona.add(i, Persona.generarPersona());
		}
		//salto de l�nea para diferenciarlo de el primer ejercicio
		System.out.println();
		
		//utilizo la segundo funci�n
		System.out.println(ordenInverso(listaPersona));
	}
	
	public static ArrayList<Persona> arrayListPersona(int cantidad){
		
		ArrayList<Persona> relleno = new ArrayList<Persona>();
		
		for (int i = 0; i < cantidad; i++) {
			relleno.add(i, Persona.generarPersona());
			System.out.println(relleno.get(i));
		}
		return relleno;
	}

	public static ArrayList<Persona> ordenInverso(ArrayList<Persona> invertir){
		
		Collections.reverse(invertir);
		return invertir;
	}
}
