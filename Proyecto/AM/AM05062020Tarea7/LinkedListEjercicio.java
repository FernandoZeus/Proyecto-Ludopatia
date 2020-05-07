package AM05062020Tarea7;

import java.util.LinkedList;

import Recurso.Persona;

public final class LinkedListEjercicio {

	public static void main(String[] args) {
		
		//Ejemplo para el primer ejercicio de LinkedList
		
		System.out.println(listaPush(10));
		
		
		//Ejemplo para el segundo ejercicio de LinkedList
		
		LinkedList<Persona>lista = new LinkedList<Persona>();
		for (int i = 0; i < 4; i++) {
			Persona p = Persona.generarPersona();
			lista.add(p);
		}
		//Para comprobar que la lista ha cambiado de orden
		System.out.println(lista);
		//Para que no quede feo
		System.out.println();
		//Cambiando el orden
		System.out.println(alRevesPopPush(lista));
		
		//Ejemplo para el tercer ejercicio de LinkedList
		
		System.out.println(listaOffer(10));
		
		//Esto es para el ejemplo, pero se puede usar el de arriba
		/*LinkedList<Persona>lista = new LinkedList<Persona>();
		for (int i = 0; i < 4; i++) {
			Persona p = Persona.generarPersona();
			lista.add(p);
		}*/
		System.out.println(lista);
		System.out.println(listaRevesOfferPoll(lista));
	}
	
// ************************************  PUSH Y POP ********************************************	
	
	public static LinkedList<Persona> listaPush(int tamanio){
		
		LinkedList<Persona>listaDevolver = new LinkedList<Persona>();
		
		for (int i = 0; i < tamanio; i++) {
			Persona p = Persona.generarPersona();
			listaDevolver.push(p);
		}
		return listaDevolver;
	}
	
	public static LinkedList<Persona> alRevesPopPush(LinkedList<Persona>listaARevertir){
		
		LinkedList<Persona>listaRevertida = new LinkedList<Persona>();
		int tamanio = listaARevertir.size();
		
		for (int i = 0; i < tamanio; i++) {
			Persona persona = listaARevertir.pop();
			listaRevertida.push(persona);
		}
		return listaRevertida;
	}
	
// ************************************  OFFER Y POLL ********************************************	
	
	public static LinkedList<Persona> listaOffer(int tamanio){
		
		LinkedList<Persona>listaDevolver = new LinkedList<Persona>();
		
		for (int i = 0; i < tamanio; i++) {
			Persona p = Persona.generarPersona();
			listaDevolver.offer(p);
		}
		return listaDevolver;
	}
	
	public static LinkedList<Persona> listaRevesOfferPoll(LinkedList<Persona>listaARevertir){
		
		LinkedList<Persona>listaDevolver = new LinkedList<Persona>();
		int tamanio = listaARevertir.size();
		
		for (int i = 0; i < tamanio; i++) {
			Persona persona = listaARevertir.pollFirst();
			listaDevolver.offerFirst(persona);
		}
		return listaDevolver;
	}
	
}
