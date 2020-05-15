package FZO0506Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;


public class PopAndPush {
	
	 static String Nombre;
	
		 public PopAndPush(String Nombre) {
			
			this.Nombre = Nombre;
		
		}

		 public static String getNombre() {
		
		return Nombre;
	
		 }
	/*//objetos tipo : PopAndPush ( de su mimsa clase en este caso ) los objetos tipo se utilizan para varias cosas
	PopAndPush ojb;
	PopAndPush obj2;
	PopAndPush obj3;
	
	static int numero;
	String nombre;
	
	

	static ArrayList <PopAndPush> pop1 = new ArrayList<PopAndPush>(numero);
	static ArrayList <PopAndPush> push1 = new ArrayList<PopAndPush>(numero);
	
	 public  ArrayList vuelta(ArrayList ArrayCualquiera){
		 
		 int i;
		 int j;
		 
		 for(i=0;i<=numero;i++){//numero
				//for(PersonaVuelta obj : lista2 )
					
					System.out.print("Escribe nombre de Persona");
					nombre= teclado.nextLine();
				 
				//	 pop1.push(nombre);
		 return ArrayCualquiera;
		 }
	 }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero =0;
		
		LinkedList <PopAndPush> PO2 = new LinkedList();
		LinkedList <PopAndPush> PO = new LinkedList();
		PO.push(new PopAndPush("Nombre1"));
		PO.push(new PopAndPush("Nombre2"));
		PO.push(new PopAndPush("Nombre3"));
		
		int i;
			for(i=0;i >= PO.size();i++) {
				PopAndPush ob = PO.get(i);
				System.out.print("Escribe nombre de Persona");
				Nombre= teclado.nextLine();
				
			}
			for(PopAndPush e : PO) {
				System.out.println(e.getNombre());
			}
		
	 PopAndPush p = PO.pop();
	
	 int tamaño = PO.size();
	 
			 while(tamaño >= 0) {
				
				 PO2.push(p);
				 tamaño--;
			}
	 // PopAndPush p = PO.pop();
	  
		 
			for(PopAndPush b : PO2) {
			
			System.out.println(b.getNombre());
			
			}
		//
		
	  //PO2.push(p);
		
		//System.out.println();
		//System.out.println();
		
		//for(PopAndPush e : PO2) {
			
			//System.out.println(e.getNombre());
		//}
		
		
	}

}
