package FZO0605Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaVuelta {

	PersonaVuelta obj;
	PersonaVuelta obj3;
	PersonaVuelta obj2;
	String Nombre;
	
	
	static int numero ;
	
	static ArrayList <PersonaVuelta> lista2 = new ArrayList<PersonaVuelta>(numero);
	static ArrayList <PersonaVuelta> lista3 = new ArrayList<PersonaVuelta>(numero);
	
	public PersonaVuelta(String Nombre) {
		
		this.Nombre = Nombre;
	
	}
	
	public String getNombre() {
		
		return Nombre;
	
	}
	
 public  ArrayList vuelta(ArrayList ArrayCualquiera){
		
	 //Preguntar como poner cualquier ArrayList que no sea PersonaVuelta
		Scanner teclado = new Scanner(System.in);
		int i=0;
		int j=0;
		
		for(i=0;i<=numero;i++){//numero
		//for(PersonaVuelta obj : lista2 )
			
			System.out.print("Escribe nombre de Persona");
			Nombre= teclado.nextLine();
			PersonaVuelta obj = new PersonaVuelta(Nombre);
			lista2.add(obj);
			//provar a utilizar get con add
			obj2=lista2.get(i);
			/*for(j=numero;j<i;j--) {
				obj2=lista3.get(j);*/
			}
			
		for(j=lista2.size()-1;j>=0;j--) {
				
			obj3=lista2.get(j);
			lista3.add(obj3);
			
			
			}
		
		for(PersonaVuelta e :lista3 ) {
			
			//Preguntar como poner el método para que cualquier 
			//Objeto se pase por parametro para no poner en este caso Persona
			
			System.out.println(e.getNombre());
		}
		
		System.out.println(lista3.size());
	
		return lista3;
	
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe número que tendrá ArrayList");
		numero= teclado.nextInt();
		PersonaVuelta objeto = new PersonaVuelta("full");
		objeto.vuelta(lista2);
	}

}
