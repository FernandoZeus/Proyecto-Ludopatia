package VGL0605Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Funciones {

    static HashMap<String, String> personas = new HashMap<String, String>();

	static String nombre;
	static Scanner in = new Scanner(System.in);

	
	public static void Nombre(String dato) {
		nombre=dato;
	}
	
	public static String getNombre() {
		return nombre;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		int num = in.nextInt();
		//System.out.println(funcion1(num)); // hace el ejercicio 1
		//System.out.println(funcion2(funcion1(num))); //hace el ejercicio 2
		//System.out.println(funcion4(funcion3(num))); //hace el ejercicio 3
		//System.out.println(funcion6(funcion5(num))); //hace el ejercicio 4
		//System.out.println(funcion7(num));// ejercicio 6 no entiendo bien a que se refiere;
		System.out.println(personas); //ejercicio 7, no he podido comprobar que funciona ya que no
										// comprendo bien el 6, aun asi te he hecho el codigo.
		
	
	}
	
	
	public static ArrayList<String> funcion1(int num){
		String nombre;

		ArrayList<String> datos= new ArrayList<>();
		for(int i=0;i<num;i++) {
			Nombre(nombre=in.next());
			datos.add(getNombre());
		}
		return datos;

	}
	
	public static ArrayList<String> funcion2(ArrayList<String> datos){
		ArrayList<String> datos2 = new ArrayList<>();
		String dato;
		for(int i=datos.size()-1;i>=0;i--) {
			dato=datos.get(i);
			datos2.add(dato);
		}
		
		return datos2;
		
	}
	
	public static LinkedList<String> funcion3(int num){
		LinkedList<String> lista = new LinkedList<String>();
		String nombre;
		for(int i=0;i<num;i++) {
			Nombre(nombre=in.next());
			lista.push(getNombre());
		}
		
		return lista;
	}
	
	public static LinkedList<String> funcion4(LinkedList<String> lista){
		LinkedList<String> lista2 = new LinkedList<String>();
		String dato;
		for(int i=lista.size()-1;i>=0;i--) {
			dato=lista.pop();
			lista2.push(dato);
		}
		
		return lista2;
	}
	
	public static LinkedList<String> funcion5(int num){
		LinkedList<String> lista = new LinkedList<String>();
		String nombre;
		for(int i=0;i<num;i++) {
			Nombre(nombre=in.next());
			lista.offer(getNombre());
		}
		
		return lista;
	}
	public static LinkedList<String> funcion6(LinkedList<String> lista){
		LinkedList<String> lista2 = new LinkedList<String>();
		String dato;
		for(int i=lista.size()-1;i>=0;i--) {
			dato=lista.poll();
			lista2.offer(dato);
		}
		
		return lista2;
	}

	public static HashMap<String,String> funcion7(int num){
	    HashMap<String, String> personas = new HashMap<String, String>();

	    for(int i=0;i<num;i++) {
	    	personas.put(getNombre(), getNombre());
	    }
		return personas;
	}
	
	public static void funcion8(HashMap <String,String> personas2){
		char c='A';
	    for(int i='A';i<'Z';i++) {
	    	System.out.println("con la letra  "+ c);
	    	if(personas2.get(i).charAt(0)==c) {
	    		System.out.println(personas2.get(i));
	    	}
	    }
	}
}
