package AM0506Tarea6;

import java.util.ArrayList;
import java.util.HashMap;

import Recurso.Persona; 

public class HashMapEjercicio2 {

	public static void main(String[] args) {
		
		
	}
	
	//Est� mal 
	public static void imprimePorNombre(HashMap<String, ArrayList<Persona>> listaImprimir) {
		
		for(char l = 'A'; l <='Z'; l++) {
			System.out.println("\nCon la letra: " + (l + "" + "\n"));
			for (int i = 0; i < listaImprimir.size(); i++) {
				System.out.println(listaImprimir);
			}
        }
	}
}
