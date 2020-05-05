package FZO0605Ejercicio5;

import java.util.*;



public class Persona {
	
	
	String Nombre;
	
	static int numero ;
	
	static ArrayList <Persona> lista = new ArrayList<Persona>(numero);
	
	public Persona(String Nombre) {
		
		this.Nombre = Nombre;
		
	}
	
	public String getNombre() {
		
		return Nombre;
	
	}
	
	public ArrayList añadir(int numero){
		
		Scanner teclado = new Scanner(System.in);
		int i=0;
		
		while(i <= numero) {
			System.out.print("Escribe nombre de Persona");
			Nombre= teclado.nextLine();
			Persona e = new Persona(Nombre);
			lista.add(e);
			i++;
		}
		
		for(Persona e : lista) {
			//Preguntar como poner el método para que cualquier 
			//Objeto se pase por parametro para no po
			
			System.out.println(e.getNombre());
		}
		System.out.println(lista.size());
	
		return lista;
	}
	
	public static void main (String []Args) {

	
	Persona objeto = new Persona("Fulano");
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print(" Número de plazas en el arraylist");
	
	numero= teclado.nextInt();
	
	objeto.añadir(numero);
	

	
	}
	
}






